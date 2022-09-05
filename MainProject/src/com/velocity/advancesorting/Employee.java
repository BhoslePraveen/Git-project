package com.velocity.advancesorting;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private int age;
	private long salary;

	public Employee(int id, String name, int age, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

//	@Override
//	public int compareTo(Employee emp) {
//
//		if (this.id == emp.getId()) {
//			return 0;
//		} else if (this.id > emp.id) {
//			return 1;
//		}
//		return -1;
//		
//		return this.id-emp.id;
//		//this.id == emp.id =>0;
//		//5-2=> Positive value;
//		//2-5=> Negative value;	
//	}
	
	

//	@Override
//	public int compareTo(Employee emp) {
//		// Logic for sorting emp as per id in ascending order.
//		if (this.id == emp.id)
//			return 0;
//		else if (this.id > emp.id)
//			return 1;
//		else
//			return -1;
//	}

//	@Override
//	public int compareTo(Employee emp) {
//		// Logic for sorting emp as per id in ascending order.
//		//return this.id-emp.id;
//		return emp.id-this.id;
//	}

//	@Override
//	public int compareTo(Employee emp) {
//		// Logic for sorting emp as per id in descending order.
//		if (this.id == emp.id)
//			return 0;
//		else if (this.id < emp.id)
//			return 1;
//		else
//			return -1;
//	}

//	@Override
//	public int compareTo(Employee emp) {
//		// Logic for sorting emp as per salary in ascending order.
//		if (this.salary == emp.salary)
//			return 0;
//		else if (this.salary < emp.salary)
//			return -1;
//	
//			return 1;
//	}

	@Override
	public int compareTo(Employee emp) {
		return this.name.compareTo(emp.name);
	}
}
