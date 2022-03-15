package tnsif.c2tc.m07.dao;

import tnsif.c2tc.m07.entity.Laptop;
import tnsif.c2tc.m07.entity.Student;

public interface StudentDao {
	void addStudent(Student student);

	void startTranscation();
	
	void endTranscation();

	void addLaptop(Laptop laptop);



}
