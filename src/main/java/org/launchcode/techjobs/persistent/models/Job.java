package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Entity
public class Job extends AbstractEntity {

//    @Id
//    @GeneratedValue
//    private int id;
//@Size(min = 1, max =51)
//@NotBlank


    @ManyToOne
    private Optional<Employer> employer;



    @OneToOne
    private Skill skill;

    @ManyToMany
    private List<Skill>skills = new ArrayList<>();



    public Job() {

    }


    public Job(Employer employer, Skill skill ) {
        super();
        this.employer = employer;
        this.skill = skill;
    }

    public Employer getEmployer() {
        return employer;
    }


    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Skill getSkill(){
    return skill;
   }

    public void setSkills(List<Skill> any) {
    }
}



    // Getters and setters.



