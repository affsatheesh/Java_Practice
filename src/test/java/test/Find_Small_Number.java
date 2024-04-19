package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Find_Small_Number {

	public static void main(String[] args) {
		
		int valueofArray[] = {10,20,5,60,70};
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,20,5,60,70));
		
		int minValue =	Collections.min(list);
		System.out.println(minValue);

		
		Arrays.sort(valueofArray);
		System.out.println(valueofArray[0]);
		
		
	}

}
