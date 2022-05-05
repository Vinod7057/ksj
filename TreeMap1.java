package com.ks;

import java.util.*;


public class TreeMap1 {

	public static void main(String args[]){  
		   // Create a tree map
		   TreeMap<Integer,String> map=new TreeMap<Integer,String>();      
		  // Put elements to the map 
		  map.put(1, "Red");
		  map.put(2, "Green");
		  map.put(3, "Black");
		  map.put(4, "White");
		  map.put(5, "Blue");
		    
		   for (Map.Entry<Integer,String> entry : map.entrySet())
		   {
		    System.out.println(entry.getKey() + " ) " + entry.getValue());
		   }
		 }  
}
