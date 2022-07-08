package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.TeacherRepository;
import com.example.demo.Model.Teacher;

@Service
public class TEacherServiceImpl implements TeacherService{
	
	@Autowired
	private TeacherRepository teacherRepository;

	@Override
	public List<Teacher> getTeacher() {
		
		return teacherRepository.findAll();
	}

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		
		return teacherRepository.save(teacher);
	}

}
