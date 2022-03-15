package tnsif.c2tc.m07.service;

import tnsif.c2tc.m07.dao.StudentDao;
import tnsif.c2tc.m07.dao.StudentDaoImpl;
import tnsif.c2tc.m07.entity.Laptop;
import tnsif.c2tc.m07.entity.Student;

public class StudentServiceImpl implements StudentService{
	StudentDao sd;
	public StudentServiceImpl()
	{
		sd=new StudentDaoImpl();
	}

	@Override
	public void addStudent(Student student) {
		sd.startTranscation();
		sd.addStudent(student);
		sd.endTranscation();
	}

	@Override
	public void addLaptop(Laptop laptop) {
		sd.startTranscation();
		sd.addLaptop(laptop);
		sd.endTranscation();	
	}

}
