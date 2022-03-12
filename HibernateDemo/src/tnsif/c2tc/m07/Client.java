package tnsif.c2tc.m07;

import tnsif.c2tc.m07.entity.Student;
import tnsif.c2tc.m07.service.StudentService;
import tnsif.c2tc.m07.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service=new StudentServiceImpl();
		Student student=new Student();
		student.setUid(2110624);
		student.setName("yogesh sawant");
		service.addStudent(student);
		service.updateStudent(student);
		Student s=service.getStudent(2110615);
		System.out.println(s);
		service.deleteStudent(2110615);
	}

}
