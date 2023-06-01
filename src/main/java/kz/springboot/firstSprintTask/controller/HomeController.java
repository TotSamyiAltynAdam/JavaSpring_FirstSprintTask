package kz.springboot.firstSprintTask.controller;

import kz.springboot.firstSprintTask.db.DBManager;
import kz.springboot.firstSprintTask.db.Students;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class HomeController {
    @GetMapping(value="/")
    public String index(Model model){
        ArrayList<Students> students = DBManager.getStudents();
        model.addAttribute("students",students);
        return "index";
    }
    @GetMapping(value="/about")
    public String about(){
        return "about";
    }
//    @RequestMapping(method= RequestMethod.POST)

    @PostMapping(value="/addStudent")
    public String addStudent(@RequestParam(name="student_name", defaultValue = "NoName") String name,
                             @RequestParam(name="student_surname", defaultValue = "NoSurname") String surname,
                             @RequestParam(name="student_exam", defaultValue = "0") int exam){
        DBManager.addStudent(new Students(null,name,surname,exam,null));
        return "redirect:/";
    }
    @GetMapping(value="/addStudentPage")
    public String addStudentPage() {return "addStudentPage";}
}
