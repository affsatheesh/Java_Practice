package test;

import java.util.ArrayList;
import java.util.Collections;

public class poly {

	public static void main(String[] args) {
		String str = "madam";
		
		ArrayList<Character> value = new ArrayList<Character>();
		
		for (Character string : str.toCharArray()) {
			value.add(string);
		}
		
		Collections.reverse(value);
		
		 String name = "";
		for (Character character : value) {
			name +=character;
			//System.out.print(character);
		}
		
		System.out.println(name);
		
		if(name.equalsIgnoreCase(str))
		{
			System.out.println("yes its poly");
		}
		else {
			System.out.println("yes its NOT poly");
		}

	}

}
