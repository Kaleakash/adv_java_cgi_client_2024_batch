package com;

public class Employee {
private int id;
private String name;
private float salary;
private Address add,add1;
	public Employee() {
		System.out.println("object created...");
	}
	
	public Employee(int id, String name, float salary) {
		super();
		System.out.println("object created using parameter");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Address getAdd1() {
		return add1;
	}

	public void setAdd1(Address add1) {
		this.add1 = add1;
	}

	public Employee(int id, String name, float salary, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.add = add;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public void display() {
		System.out.println("Employee class method");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + ", add1=" + add1 + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
}
