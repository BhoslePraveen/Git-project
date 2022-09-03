package com.velocity.collections;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args) {
		HashSet<String> nameSet = new HashSet<String>();
		nameSet.add("Praveen");
		nameSet.add("Vaibhav");
		nameSet.add("sachin");
		nameSet.add("arjun");
		for (String str : nameSet) {
			System.out.println(str);
		}

	}

}
