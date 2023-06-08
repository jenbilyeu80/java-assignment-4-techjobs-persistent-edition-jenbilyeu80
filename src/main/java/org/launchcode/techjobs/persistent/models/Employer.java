package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Employer extends AbstractEntity {
    @Size(min = 1, max =51)
    @NotNull
    private String location;

    @OneToMany
    @JoinColumn

private List<Job> job = new ArrayList<>();
    public Employer(){

    };

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}


