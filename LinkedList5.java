package com.ks;
import java.util.*;

public class LinkedList5 {

	public static void main(String[] args) {
	
		LinkedList<String> li = new LinkedList<String>();
		li.add("adi");
		li.add("vinod");
		li.add("ganesh");
		li.add("sahil");
		li.add("kunal");
		LinkedList<String> li2 = new LinkedList<String>();
		li2.add("adi");
		li2.add("vinod");
		
		li2.add("kunal");
		li2.add("Error");
		
		LinkedList<String> li3= new LinkedList<String>();
		for(String e :li)
			li3.add(li2.contains(e)?"yes" : "not");
		System.out.println(li3);
		
				
		
		
	}

}
