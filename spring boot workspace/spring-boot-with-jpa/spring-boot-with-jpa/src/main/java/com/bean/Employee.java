package com.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Component
@Scope("prototype")
//@Data
@Setter					
@Getter
@ToString				
@AllArgsConstructor			// parameter constructor 
@NoArgsConstructor			// empty constructor 
public class Employee {
@Id
private int eid;
private String ename;
private float salary;
//public int getEid() {
//	return eid;
//}
//public void setEid(int eid) {
//	this.eid = eid;
//}
//public String getEname() {
//	return ename;
//}
//public void setEname(String ename) {
//	this.ename = ename;
//}
//public float getSalary() {
//	return salary;
//}
//public void setSalary(float salary) {
//	this.salary = salary;
//}
//@Override
//public String toString() {
//	return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
//}

}
