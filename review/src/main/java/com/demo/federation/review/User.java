package com.demo.federation.review;

import java.util.List;

public class User {

    private final String id;
    private List<Review> reviews;

    public User(final String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(final List<Review> reviews) {
        this.reviews = reviews;
    }
}