package com.velocity.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//This class shows how to sort primitive arrays, 
//Wrapper classes Object Arrays
public class BasicSort {

	public static void main(String[] args) {
		//sort primitives array like int array
        int[] intArr = {5,9,1,10};
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        
        //sorting String array
        String[] strArr = {"A", "C", "B", "Z", "E"};
        Arrays.sort(strArr);
        System.out.println("\n");
        System.out.println(Arrays.toString(strArr));
        
      //sorting list of objects of Wrapper classes
        List<String> strList = new ArrayList<String>();
        strList.add("A");
        strList.add("C");
        strList.add("B");
        strList.add("Z");
        strList.add("E");
        Collections.sort(strList);
        System.out.println("\n");
        for(String str: strList) System.out.print(" "+str);
      //sorting list of objects of Wrapper classes
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(5);
        intList.add(9);
        intList.add(1);
        intList.add(10);
        Collections.sort(intList);
        System.out.println("\n");
        for(Integer num: intList) System.out.print(" "+num);

	}

}
