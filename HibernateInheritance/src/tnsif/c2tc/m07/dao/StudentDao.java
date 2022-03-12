package tnsif.c2tc.m07.dao;

import tnsif.c2tc.m07.entity.Student;

public interface StudentDao {

	void addStudent(Student student);

	void startTranscation();
	
	void endTranscation();

	void updateStudent(Student student);

	Student getStudent(int uid);

	void deleteStudent(int uid);

}
