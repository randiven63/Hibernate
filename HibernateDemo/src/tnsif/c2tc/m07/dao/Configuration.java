package tnsif.c2tc.m07.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Configuration {
	EntityManager entityManager;
	EntityManagerFactory entityManagerFactory;
	
	public Configuration()
	{
		entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
		entityManager = entityManagerFactory.createEntityManager();
	}
}
