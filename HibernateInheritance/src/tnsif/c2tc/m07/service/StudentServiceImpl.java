package tnsif.c2tc.m07.service;

import tnsif.c2tc.m07.dao.StudentDao;
import tnsif.c2tc.m07.dao.StudentDaoImpl;
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
	public void updateStudent(Student student) {
		sd.startTranscation();
		sd.updateStudent(student);
		sd.endTranscation();
	}

	@Override
	public Student getStudent(int uid) {
		Student s=sd.getStudent(uid);
		return s;
	}

	@Override
	public void deleteStudent(int uid) {
		sd.startTranscation();
		sd.deleteStudent(uid);
		sd.endTranscation();
	}

}
