package com.ks;
import java.util.*;

public class LinkedList1 {
	public static void main(String [] args) {
		LinkedList<String> ll =new LinkedList<String>();
		ll.add("red");
		ll.add("blue");
		ll.add("black");
		ll.add("white");
		System.out.println(ll);
		
		ll.add(2,"orange");
		System.out.println(ll);
		//for(String element : ll) {
			//System.out.println(element);
		//}
		Iterator it=ll.descendingIterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
		
	}

}
