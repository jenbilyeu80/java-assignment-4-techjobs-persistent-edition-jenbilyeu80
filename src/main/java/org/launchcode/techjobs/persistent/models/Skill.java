package org.launchcode.techjobs.persistent.models;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;

@Entity

public class Skill extends AbstractEntity {
    @Size(min=1, max=100)
    private String description;
    private String jobs;

    @ManyToMany(mappedBy = "skills")
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;


    }

    public Skill() {
    }

    public Skill(String jobs) {
        this.jobs = jobs;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }
}

