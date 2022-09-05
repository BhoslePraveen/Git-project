package com.velocity.advancesorting.comparator;

import java.util.Comparator;

public class Impl3 implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getId()-emp2.getId();
	}

}
