package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Teacher;

public interface TeacherService {

	List<Teacher> getTeacher();

	Teacher saveTeacher(Teacher teacher);

}
