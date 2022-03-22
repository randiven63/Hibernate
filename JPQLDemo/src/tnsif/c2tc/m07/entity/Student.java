package tnsif.c2tc.m07.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.dom4j.Branch;

@Entity
@Table(name = "details")
@NamedQueries(@NamedQuery(name = "getAllStudents",
							query = "select s from Student s"))
public class Student {
	@Id
	private int uid;
	private String name;
	private String trainer_name;
	@Temporal(TemporalType.DATE)
	private Date dateofbirth;
	private float marks;
	//private enum Branch;
	
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
	public String getTrainer_name() {
		return trainer_name;
	}
	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [uid=" + uid + ", name=" + name + ", trainer_name=" + trainer_name + ", dateofbirth="
				+ dateofbirth + ", marks=" + marks + "]";
	}
	
}
