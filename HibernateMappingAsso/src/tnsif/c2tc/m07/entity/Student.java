package tnsif.c2tc.m07.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity

public class Student implements Serializable{
	@Id
	private int uid;
	private String name;
	@OneToOne
	private Laptop laptop;
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
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	@Override
	public String toString() {
		return "Student [uid=" + uid + ", name=" + name + "]";
	}
	
}


