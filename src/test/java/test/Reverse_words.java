package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Reverse_words {

	public static void main(String[] args) {
		String value ="I love Sathesh";
		
		String[] words = value.split(" ");
		
		Collections.reverse(Arrays.asList(words));
		
		System.out.println(String.join(" ", words));
		
		
	}
}
