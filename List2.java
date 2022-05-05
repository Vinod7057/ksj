package com.ks;
import java.util.*;

public class List2 {
	public static void main(String [] arg) {
		List<String> ls =new ArrayList<String>();
		ls.add("swift");
		ls.add("Range Rover");
		ls.add("Tata");
		ls.add("Honda");
		ls.add("BMW");
		
		System.out.println(ls);
		
		//String element = ls.get(2);
		System.out.println(ls.get(2));
		
		//element=ls.get(3);
		//System.out.println(element);
		
		//ls.remove(1);
		//System.out.println(ls);
		System.out.println(ls.contains("swift"));
		Collections.sort(ls);
		System.out.println(ls);
		
		
	}

}
