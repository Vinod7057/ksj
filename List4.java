package com.ks;
import java.util.*;

public class List4 {
	public static void main(String[] arg) {
		List<String> ls =new ArrayList<String>();
		ls.add("adi");
		ls.add("purush");
		ls.add("vinod");
		System.out.println(ls);
		
		List<String> ls2 =new ArrayList<String>();
		ls2.add("ganesh");
		ls2.add("narendra");
		ls2.add("kunal");
		System.out.println(ls2);
		
		//Collections.copy(ls,ls2);
		//System.out.println(ls);
		//System.out.println(ls2);
		
		Collections.copy(ls2,ls);
		System.out.println(ls2);
		System.out.println(ls);
		Collections.reverse(ls);
		System.out.println(ls);
		 
		
	}

}
