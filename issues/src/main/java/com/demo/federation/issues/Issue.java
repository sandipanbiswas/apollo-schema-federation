package com.demo.federation.issues;

import java.util.Objects;

public class Issue {

    private String id;

    private String description;

    private User assigneeId;

    public Issue(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(User assigneeId) {
        this.assigneeId = assigneeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Issue issue = (Issue) o;
        return Objects.equals(id, issue.id) &&
                Objects.equals(description, issue.description) &&
                Objects.equals(assigneeId, issue.assigneeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, assigneeId);
    }
}