package com.av;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
	public static void main(String[] args) {
	      ArrayList al=new ArrayList();
	      al.add("Frist");
	      al.add("Second");
	      al.add("Third");
	      al.add("Random");
	      al.add("Click");
	      System.out.println(al);
	      String[] strArr= new String[al.size()];
	      al.toArray(strArr);
	      System.out.println("\n Created Array Content:");
	      for(String str:strArr) {
	    	  System.out.println(str);
	      }
	      	         
	      
	     /* List list= al.subList(2, 4);
	      System.out.println(list);*/
	      
	      
	      /*list.add("Second");
	      list.add("Random");
	      System.out.println(al.containsAll(list));
	      list.add("one");
	      System.out.println(al.containsAll(list));*/
	}
}
