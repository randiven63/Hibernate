package tnsif.c2tc.m07;

import tnsif.c2tc.m07.entity.Laptop;
import tnsif.c2tc.m07.entity.Student;
//import tnsif.c2tc.m07.entity;
import tnsif.c2tc.m07.service.StudentService;
import tnsif.c2tc.m07.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service=new StudentServiceImpl();
		Student student=new Student();
		Laptop laptop=new Laptop();
		student.setUid(2100810);
		student.setName("Surendra");
		laptop.setLid(1);
		laptop.setLname("lenovo");
		student.setLaptop(laptop);
		service.addLaptop(laptop);
		service.addStudent(student);
		
	}

}
