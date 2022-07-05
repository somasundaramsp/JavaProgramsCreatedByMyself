package samplePrograms;

import java.util.Scanner;

public class Square {

	public static void main(String args[]) {
        
        Double num;
        Scanner somu= new Scanner(System.in);
 
        System.out.print("Enter a number: ");
        num=somu.nextDouble();
         
        Double square = num*num;
        System.out.println("Square of "+ num + " is: "+ square);
    }
}
