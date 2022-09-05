package com.velocity.advancesorting.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// Creating list of names
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(10, "Mukesh", 25, 10000));
		empList.add(new Employee(15, "Arun", 29, 20000));
		empList.add(new Employee(5, "Lina", 35, 5000));
		empList.add(new Employee(1, "Pankaj", 32, 50000));
		Collections.sort(empList,(a,b)->{return a.getId()-b.getId();}); // I am not getting error at this line.
		System.out.println(empList);

		Collections.sort(empList,(a,b)->{return (int) (a.getSalary()-b.getSalary());}); // I am not getting error at this line.
		System.out.println(empList);
	}

}
