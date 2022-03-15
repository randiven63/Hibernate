package tnsif.c2tc.m07.dao;

import javax.persistence.EntityManager;

import tnsif.c2tc.m07.entity.Laptop;
import tnsif.c2tc.m07.entity.Student;

public class StudentDaoImpl implements StudentDao{
	EntityManager entityManager;
	public StudentDaoImpl()
	{
		entityManager=Configuration.getEntityManager();
	}
	
	@Override
	public void addStudent(Student student) {
		entityManager.persist(student);
	}

	@Override
	public void startTranscation() {
		entityManager.getTransaction().begin();		
	}

	@Override
	public void endTranscation() {
		entityManager.getTransaction().commit();
	}

	@Override
	public void addLaptop(Laptop laptop) {
		entityManager.persist(laptop);
	}

	
}
