package com.Spring_restapi_project.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.Spring_restapi_project.demo.model.Student;
import com.Spring_restapi_project.demo.service.StudentServiceImp;



@Controller
public class StudentController {
	   @Autowired
	   StudentServiceImp studentImp;
	   @RequestMapping("/NewStudent")
	   public String showForm(Model model) {
		   Student student = new Student();
		   model.addAttribute("student" ,student);
		   return "Form.jsp";
	   }
	   @RequestMapping("/formSave")
       public String AddStdent(Student student) {
		   
    	   studentImp.AddStudent(student);
 
    	   return "success.jsp";
       }
	   
	   @GetMapping(path="/search")
	   public String findStudent( @RequestParam long name , ModelMap model){
		   model.put("student", studentImp.findById(name));
		   System.out.print(studentImp.findById(name));
		   return "list.jsp";
	   }
}
