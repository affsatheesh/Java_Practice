package test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ascending {

	public static void main(String[] args) {


		ArrayList<Integer> value = new ArrayList<Integer>(Arrays.asList(30,20,40,50));
		
		Collections.sort(value);
		
		for (Integer integer : value) {
			System.out.println(integer);
		}
	
	}
}
