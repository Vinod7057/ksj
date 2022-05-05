package com.ks;

import java.util.HashSet;

public class HashGetno {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("kunal");
		hs.add("modi");
		hs.add("ganesh");
		hs.add("adi");
		
		System.out.println(hs);
		System.out.println(hs.size());//size of array
		HashSet<String> sh = new HashSet<String>();
		sh = (HashSet)hs.clone();//clone 
		System.out.println(sh);
		hs.remove("adi"); //remove one
		System.out.println(hs);
		hs.removeAll(hs); //    remove all
		System.out.println(hs);
		
	}

}
