package com.demo.federation.issues;

import java.util.List;

public class User {

    private String id;

    private List<Issue> issues;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }
}
