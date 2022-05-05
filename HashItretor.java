package com.ks;

import java.util.*;
import java.util.HashSet;
import java.util.Iterator;

public class HashItretor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>hs = new HashSet<String>();
		hs.add("error");
		hs.add("kiran");
		hs.add("ganesh");
		hs.add("adi");
		hs.add("kunal");
		System.out.println(hs);
		
		Iterator<String> p = hs.iterator();
		while (p.hasNext()) {
			System.out.println(p.next());
			
		}

	}

}
