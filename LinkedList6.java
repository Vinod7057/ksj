package com.ks;
import java.util.*;
public class LinkedList6 {
	public static void main(String[]args) {
		LinkedList<String> li =new LinkedList<String>();
		li.add("red");
		li.add("pink");
		li.add("blue");
		li.add("white");
		li.add("black");
		System.out.println("orignal list : "+li);
		/*System.out.println("empty or not :"+li.isEmpty());
		li.removeAll(li);
		System.out.println("remove all element :"+li);
		System.out.println("empty or not :"+li.isEmpty());*/
		li.set(3, "orange");
		System.out.println(li);
	}

}
