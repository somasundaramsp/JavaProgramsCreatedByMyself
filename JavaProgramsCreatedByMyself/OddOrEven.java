package samplePrograms;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {

        Scanner somu = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = somu.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
