package org.launchcode.techjobs.persistent.models;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
public class Job extends AbstractEntity {

//    @Id
//    @GeneratedValue
//    private int id;
//@Size(min = 1, max =51)
//@NotBlank


    @ManyToOne

    private Employer employer;
    private Skill skill;

    public Job() {
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = new Employer();
    }

    public Job(String Employer, String Skill) {
        super();
        this.employer = new Employer();
        this.skill = new Skill();

    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
    // Getters and setters.



