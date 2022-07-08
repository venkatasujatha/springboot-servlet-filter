package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Teacher;
import com.example.demo.Service.TeacherService;

@RestController
public class FilterController {
	
	@Autowired
	private TeacherService teacherService;
	
	@GetMapping("/hello")
	public String getHome()
	{
		return "Hello world";
	}
	
	@GetMapping("/findall")
	public List<Teacher> getTeacher()
	{
		return teacherService.getTeacher();
	}
	@PostMapping("/save")
	public Teacher addTeacher(@RequestBody Teacher teacher)
	{
		return teacherService.saveTeacher(teacher);
	}

}
