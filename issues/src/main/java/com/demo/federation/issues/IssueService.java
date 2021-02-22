package com.demo.federation.issues;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class IssueService {

    private List<Issue> issues = new ArrayList<>();

    @PostConstruct
    public void init() {
        Issue issue1 = new Issue("1", "description1");
        Issue issue2 = new Issue("2", "description2");
        User user1 = new User();
        user1.setId("1");
        user1.setIssues(Arrays.asList(issue1, issue2));
        issue1.setAssigneeId(user1);
        issue2.setAssigneeId(user1);
        issues.add(issue1);
        issues.add(issue2);
    }

    @NotNull
    public User lookupUser(@NotNull String id) {
        User user = new User();
        user.setId(id);
        List<Issue> assignedIssues = issues.stream().filter(issue -> issue.getAssigneeId().getId().equals(id)).collect(Collectors.toList());
        user.setIssues(assignedIssues);
        return user;
    }

    @NotNull
    public Issue lookupIssue(@NotNull String issueId) {
        Issue issue = issues.stream().filter(curr -> curr.getId().equals(issueId)).findFirst().orElse(null);
        return issue;
    }
}