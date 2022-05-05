package com.ks;
import java.util.*;
public class LinkedList3 {

	public static void main(String[] args) {
	
		LinkedList<String> li = new LinkedList<String>();
		li.add("red");
		li.add("blue");
		li.add("white");
		li.add("pink");
		
		 System.out.println("list 1 :"+li);
		 
		 LinkedList<String> li2 = new LinkedList<String>();
	
		 li2.add("black");
		 li2.add("green");
		 
		 li2.addAll(li);
		 
		 System.out.println("list1 add on list2 :"+li2);
		 System.out.println("Size of list :" +li2.size());
		 li.remove(1);
		 System.out.println("remove 1 element :" +li);
		 //li.clear();
		 //System.out.println("Remove All element :"+li);
		 
		 Collections.swap(li,0,2);
		 System.out.println(li);
	
	
	}

}
