package org.launchcode.techjobs.persistent.controllers;

import org.launchcode.techjobs.persistent.models.Employer;
import org.launchcode.techjobs.persistent.models.Job;
import org.launchcode.techjobs.persistent.models.Skill;
import org.launchcode.techjobs.persistent.models.data.EmployerRepository;
import org.launchcode.techjobs.persistent.models.data.JobRepository;
import org.launchcode.techjobs.persistent.models.data.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

/**
 * Created by LaunchCode
 */
@Controller
public class HomeController {
   @Autowired
    public EmployerRepository employerRepository;
   public SkillRepository skillRepository;

   @Autowired
   public JobRepository jobRepository;

    @RequestMapping("")
    public String index(Model model) {

        model.addAttribute("title", "My Jobs");

        return "index";
    }

    @GetMapping("add")
    public String displayAddJobForm(Model model) {
        model.addAttribute("title", "Add Job");
        model.addAttribute(new Job());
        model.addAttribute("employers", employerRepository.findAll());

        return "add";
    }

    @PostMapping("add")
    public String processAddJobForm(@RequestParam List<Integer>skills, @ModelAttribute @Valid Job newJob,
                                       Errors errors, Model model, @RequestParam int employerId) {
        List<Skill> skillObjs= (List<Skill>) skillRepository.findAllById(skills);
        newJob.setSkills(skillObjs); {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Job");
            return "add";
        }

        return "redirect:";
    }

    @GetMapping("view/{jobId}")
    public String displayViewJob(Model model, @PathVariable int jobId) {

        return "view";
    }

    //@PostMapping("addEmployer")
    //public String processAddJobForm(Model model, @RequestParam int employerId, @ModelAttribute @Valid Job newJob,
    //Errors errors) {

       // if (errors.hasErrors()) {
          //  return "add";
        //}

//



        jobRepository.save(newJob);

        return "redirect.";
}
}
