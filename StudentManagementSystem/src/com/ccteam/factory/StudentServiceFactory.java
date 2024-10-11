package com.ccteam.factory;

import com.ccteam.service.StudentService;
import com.ccteam.service.StudentServiceImpl;

public class StudentServiceFactory {
	private static StudentService studentService;
	static {
		studentService = new StudentServiceImpl();
	}

	public static StudentService getStudentService() {
		return studentService;
	}
}
