package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Job {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=3)
    private String employer;

    @NotNull
    @Size(min=10)
    private String description;

    public long getId() {
        return id;
    }

    public String getEmployer() {
        return employer;
    }

    public String getDescription() {
        return description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
