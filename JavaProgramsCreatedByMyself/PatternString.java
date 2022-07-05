package samplePrograms;

import java.util.ArrayList;

public class PatternString {
	
	public static void main(String[] args) {

		      ArrayList <String> list = new ArrayList<String>();
		      list.add("Somu");
		      list.add("Soma");
		      list.add("Somasundaram");
		      list.add("Meena");
		      list.add("Meenu");
		      list.add("Meenakshi");
		      list.add("Marriage");
		      list.add("Completed");
		      list.add("Sep 1, 2021");
		      list.add("Vairavanpatti");
		      list.add("Karaikudi");
		      list.add("Tamilnadu");
		      System.out.println("Contents of the array list: ");
		      for (String sp : list){
		         if (sp.contains("Som")){
		               System.out.println(sp);
		         }
		      }
		   }
}

