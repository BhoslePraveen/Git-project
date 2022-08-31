package com.velocity.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		// Creating list of names
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Pawan");
		nameList.add("Rahul");
		nameList.add("vishnu");
		nameList.add("omkar");

		// using iterator
		Iterator<String> itr = nameList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// using for-each loop
		for (String name : nameList) {
			System.out.println(name);
		}

	}

}
