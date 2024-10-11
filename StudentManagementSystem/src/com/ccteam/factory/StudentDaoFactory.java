package com.ccteam.factory;

import com.ccteam.dao.StudentDao;
import com.ccteam.dao.StudentDaoImpl;

public class StudentDaoFactory {
	private static StudentDao studentDao;
	static {
		studentDao = new StudentDaoImpl();
	}

	public static StudentDao getStudentDao() {
		return studentDao;
	}
}
