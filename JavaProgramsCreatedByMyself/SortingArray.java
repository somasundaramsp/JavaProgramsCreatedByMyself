package samplePrograms;

import java.util.*;

public class SortingArray {

	public static void main(String[] args)
    {
   
        Integer array[] = { 8, 3, 22, 55, 1, 85, 97,6, 62, 43 };
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }
}
