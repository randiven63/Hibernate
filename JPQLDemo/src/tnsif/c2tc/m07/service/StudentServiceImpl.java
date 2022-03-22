package tnsif.c2tc.m07.service;

import java.util.Date;
import java.util.List;

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
	public void addStudent(Student s) {
		sd.startTransaction();
		sd.addStudent(s);
		sd.endTransaction();
		
	}
	@Override
	public Long getcount()
	{
		return sd.getcount();
		
	}
	@Override
	public List<Student> getStudentbytrainername(String string)
	{
		List<Student> list=sd.getStudentbytrainername(string);
		return list;
	}
	@Override
	public List<Student> getStudentintherangeofdate(Date date1, Date date2)
	{
		List<Student> list=sd.getStudentintherangeofdate(date1,date2);
		return list;
	}
	@Override
	public List<Student> getAllStudents() {
		List<Student> list=sd.getAllStudents();
		return list;
	}

}
