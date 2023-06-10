package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Employer<list, employer> extends AbstractEntity {
    @Size(min = 1, max = 51)
    @NotNull
    private String location;




    @JoinColumn(name = "employer_id")
    @OneToMany
    private List<Job> jobs = new ArrayList<>();

    private String list = String.valueOf(new ArrayList<>());


        public String getLocation () {
            return location;
        }

        public void setLocation (String location){
            this.location = location;
        }


    }



