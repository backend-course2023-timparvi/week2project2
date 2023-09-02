package be.week2project2.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import be.week2project2.domain.Student;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
   
	@GetMapping("/hello")
    public String hello(Model model) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Teppo", "Tuppurainen"));
        students.add(new Student("Milla", "Magia"));

        model.addAttribute("welcomeMessage", "Welcome to Haaga-Helia!");
        model.addAttribute("students", students);

        return "hello";
    }
}