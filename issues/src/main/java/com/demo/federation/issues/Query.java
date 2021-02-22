package com.demo.federation.issues;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Service;

@Service
public class Query implements GraphQLQueryResolver {

    private final IssueService issueService;

    public Query(final IssueService issueService) {
        this.issueService = issueService;
    }

    public Issue getIssue(Integer issueId, final DataFetchingEnvironment dataFetchingEnvironment) {
        return issueService.lookupIssue(String.valueOf(issueId));
    }
}

