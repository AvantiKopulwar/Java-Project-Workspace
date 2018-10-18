package com.av;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
public static void main(String[] args) {
      ArrayList al=new ArrayList();
      al.add("JAVA");
      al.add("C++");
      al.add("PERL");
      al.add("PHP");
      System.out.println(al);
      /*System.out.println("Element at index1:"+al.get(1));
      System.out.println("Dose list contain JAVA?"+al.contains("JAVA"));
      al.add(2, "PLAY");
      System.out.println(al);
      System.out.println("is array list empty?"+al.isEmpty());
      System.out.println("Index of PERL is-"+al.indexOf("PERL"));
      System.out.println("size of arraylist"+al.size());
*/
      List list= new ArrayList();
      list.add("one");
      list.add("two");
      al.addAll(list);
      System.out.println("\n"+al);
}
}
