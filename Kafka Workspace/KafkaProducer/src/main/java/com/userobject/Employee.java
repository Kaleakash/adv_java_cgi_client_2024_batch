package com.userobject;

import java.beans.Transient;
import java.io.Serializable;

public class Employee implements Serializable{
private String fname;
transient
private int age;
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String fname, int age) {
	super();
	this.fname = fname;
	this.age = age;
}
@Override
public String toString() {
	return "Employee [fname=" + fname + ", age=" + age + "]";
}

}
