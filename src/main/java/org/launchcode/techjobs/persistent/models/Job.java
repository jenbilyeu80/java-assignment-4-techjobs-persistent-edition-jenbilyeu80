package org.launchcode.techjobs.persistent.models;

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

    private Job job;

    public Job() {

    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }


//public void job(){
      //  super();
//}

    //public Job//(String employer, String skill) {
       //super();
       // this.Employer = new employer();
        //this.Skill = new skill();
    //}
//}

    public Skill getSkill(){
    return skill;
   }
}
    //public void  setSkill(String skill) {
      //  Skill = skill;
 
  //  }
//}


    // Getters and setters.



