package samplePrograms;

import java.util.ArrayList;

public class SearchWord {

	public static void main(String[] args) {

	      ArrayList <String> list = new ArrayList<String>();
	      list.add("An apple fell from the apple tree in an apple farm. ");
	      list.add("Apple");
	      list.add("fell");
	      list.add("from");
	      list.add("the");
	      list.add("apple");
	      list.add("tree");
	      list.add("in");
	      list.add("an");
	      list.add("apple");
	      list.add("farm");
	      System.out.println("Contents of the array list: ");
	      for (String sp : list){
	         if (sp.contains("appl")){
	               System.out.println(sp);
	         }
	      }
	   }
}
