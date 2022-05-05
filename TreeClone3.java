package com.ks;

import java.util.TreeSet;

public class TreeClone3 {
	public static void main(String[] args) {
		  TreeSet<String> t1 = new TreeSet<String>();
		  t1.add("Red");
		  t1.add("Green");
		  t1.add("Orange");
		  t1.add("Pink");
		  t1.add("White");
		  t1.add("Black");
		  System.out.println(t1);
		  
		  
		   TreeSet<String> new_t1 =(TreeSet<String>)t1.clone();
		   System.out.println(t1);
	}


}
