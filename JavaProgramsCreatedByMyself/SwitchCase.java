package samplePrograms;

public class SwitchCase {

	public static void main(String[] args) {

	    int number = 52;
	    String size;

	    switch (number) {

	      case 1:
	        size = "One";
	        break;

	      case 2:
	        size = "Two";
	        break;

	      case 3:
	        size = "Three";
	        break;

	      case 4:
	        size = "Four";
	        break;
	        
	      case 5:
		        size = "Five";
		        break;
	      
	      default:
	        size = "Unknown";
	        break;

	    }
	    System.out.println("Size: " + size);
	  }
}
