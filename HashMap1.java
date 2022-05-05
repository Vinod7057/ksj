package com.ks;

import java.util.*;
import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
	
		HashMap<Integer,String> mp = new HashMap<Integer,String>();
		mp.put(1,"vinod");
		mp.put(2,"Avinash");
		mp.put(3,"Ganesh");
		mp.put(4,"Error");
		for(Map.Entry x:mp.entrySet()) {
			System.out.println(x.getKey()+"  "+x.getValue());
		}
			
		}   

	}


