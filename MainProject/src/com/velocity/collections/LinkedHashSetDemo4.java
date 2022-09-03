package com.velocity.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo4 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> evenNumberSet = new LinkedHashSet<>();
		evenNumberSet.add(2);
		evenNumberSet.add(4);
		evenNumberSet.add(6);
		evenNumberSet.add(8);

		Iterator<Integer> itr = evenNumberSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

}
