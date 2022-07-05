package samplePrograms;

import java.util.Scanner;

public class Greatest {

	private static Scanner sp;
	public static void main(String[] args) 
	{
		int number1, number2;
		sp = new Scanner(System.in);
		
		System.out.print(" Please Enter the First Number : ");
		number1 = sp.nextInt();	
		
		System.out.print(" Please Enter the Second Number : ");
		number2 = sp.nextInt();	
		
		if(number1 > number2) 
	    {
			System.out.println("\n The Largest Number = " + number1);          
	    } 
	    else if (number2 > number1)
	    { 
	    	System.out.println("\n The Largest Number = " + number2);        
	    } 
	    else 
	    {
	    	System.out.println("\n Both are Equal");
	    }		
	}	
}
