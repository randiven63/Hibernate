package tnsif.c2tc.m07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Branch;

import tnsif.c2tc.m07.entity.Student;
import tnsif.c2tc.m07.service.StudentService;
import tnsif.c2tc.m07.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) throws ParseException {
		//Scanner sc=new Scanner(System.in);
		//student.setUid(sc.nextInt());
		//student.setName(sc.next());
		
		Student student=new Student();
		StudentService service=new StudentServiceImpl();
		String datestring1="01-01-2000";
		String datestring2="01-12-2000";

		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		Date date1=format.parse(datestring1);
		Date date2=format.parse(datestring2);

		student.setUid(2110620);
		student.setName("Akshatha");
		student.setTrainer_name("Nitara");
		student.setMarks(88.8f);
		student.setDateofbirth(date1);
		//student.setBranch(Branch.CSE);
		//System.out.println(student.getDateofbirth());
		service.addStudent(student);
		
		//System.out.println(service.getcount());
		
		//System.out.println(service.getStudentbytrainername("Sanjana"));
		
		//System.out.println(service.getStudentintherangeofdate(date1,date2));

		//for all Students details
		List<Student> list=service.getAllStudents();
		Iterator<Student> it=list.iterator();
		while(it.hasNext())
		System.out.println(it.next());
	}

}
