package tnsif.c2tc.m07.service;

import tnsif.c2tc.m07.entity.Student;

public interface StudentService {
	void addStudent(Student student);

	void updateStudent(Student student);

	Student getStudent(int uid);

	void deleteStudent(int uid);

}
