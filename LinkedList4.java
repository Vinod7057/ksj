package com.ks;
import java.util.*;

public class LinkedList4 {

	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<String>();
		li.add("vinod");
		li.add("narendra");
		li.add("ganesh");
		System.out.println("Linkedlist : "+li);
		/*//System.out.println(li.pop());
		//String x =li.peekLast();
		//System.out.println(x);
		
		if(li.contains("narendra")) {
			System.out.println("yes ");
		}
		else {
			System.out.println("no" );
		}*/
		List<String> list =new ArrayList<String>();
		for (String str:li) {
			System.out.println("Arraylist :"+str);
		}

	}

}
