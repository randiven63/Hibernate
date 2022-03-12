package tnsif.c2tc.m07;

import tnsif.c2tc.m07.entity.C2TC_M07;
import tnsif.c2tc.m07.service.StudentService;
import tnsif.c2tc.m07.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service=new StudentServiceImpl();
		C2TC_M07 student=new C2TC_M07();
		student.setUid(2100805);
		student.setName("Harshitha");
		student.setTech_trainer("Sanjana Mam");
		student.setSoftskill_trainer("Nitara Mam");
		service.addStudent(student);
	}

}
