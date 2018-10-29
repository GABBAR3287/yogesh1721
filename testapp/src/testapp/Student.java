package testapp;

import java.io.Serializable;

public class Student implements Serializable {
	
	private int rollno;
	private String name;
	private boolean isIndian;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public Student(int rollno, String name, boolean isIndian) {
		super();
		this.rollno = rollno;
	
		this.name = name;
	}
	public boolean getisIndian() {
		return isIndian;
	}
	public void setIndian(boolean isIndian) {
		this.isIndian = isIndian;
	}
	
	
	}
