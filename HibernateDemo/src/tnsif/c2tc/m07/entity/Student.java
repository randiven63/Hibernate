package tnsif.c2tc.m07.entity;

import java.io.Serializable;

//import javax.persistence.DiscriminatorColumn;
//import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Inheritance;
//import javax.persistence.InheritanceType;
//import javax.persistence.Table;

@Entity
//@Table(name = "New" )
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE )
//@DiscriminatorColumn(name = "Student",discriminatorType = DiscriminatorType.STRING)
public class Student //implements Serializable// 
{
	@Id
	private int uid;
	private String name;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
