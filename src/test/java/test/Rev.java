package test;

import java.util.ArrayList;
import java.util.Collections;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value = "Sathesh";
		
		char[] letter = value.toCharArray();
		
		ArrayList<Character> list = new ArrayList<Character>();
		for (char string : letter) {
			list.add(string);
		}
		
		Collections.reverse(list);
		
		for (Object object : list) {
			System.out.print(object);
		}
	}
}
