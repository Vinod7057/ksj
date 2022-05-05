package com.ks;
import java.util.*;


public class HashSettoArray {

	public static void main(String[] args) {
		HashSet<String>hs =new HashSet<String>();
		hs.add("sahil");
		hs.add("ganesh");
		hs.add("kunal");
		hs.add("kiran");
		hs.add("purush");
		
		System.out.println(hs);
		String[] new_array = new String[hs.size()];
	      hs.toArray(new_array);
	      for(String e : new_array) {
	    	  System.out.println(e);
	      }

	}

}
