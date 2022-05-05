package com.ks;
import java.util.*;

public class List5 {
	public static void main(String[] arg) {
		ArrayList<String> ls =new ArrayList<String>();
		ls.add("vinod");
		ls.add("purush");
		ls.add("adi");
		System.out.println(ls);
		
		ls.ensureCapacity(6 );
		ls.add("ganesh");
		ls.add("Error");
		ls.add("kunal");
		System.out.println(ls);
	}

}
