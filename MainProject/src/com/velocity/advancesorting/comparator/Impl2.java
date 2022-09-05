package com.velocity.advancesorting.comparator;

import java.util.Comparator;

public class Impl2 implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if(emp1.getSalary()==emp2.getSalary()) {
			return 0;
		} else if(emp1.getSalary()>emp2.getSalary()) {
			return 1;
		}
		return -1;
	}

	

}
