package com.ks;
import java.util.*;

public class LinkedList2 {

	public static void main(String[] args) {

		LinkedList<String> li =new LinkedList<String>();
		li.add("ganesh");
		li.add("kunal");
		li.add("sahil");
		li.add("adi");
		System.out.println("orignal list  :" + li);
		li.addFirst("narendra");
		li.addLast("Error");
		System.out.println(li);		
		
		
		
	}

}
