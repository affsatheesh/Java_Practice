package test;

import java.util.Arrays;
import java.util.HashSet;

public class Missing_Alb_Form_String {

	public static void main(String[] args) {
		String letter ="a";
		letter = letter.replaceAll(" ", "");
		String[] letterName=letter.split("");
		
		HashSet sets = new HashSet(Arrays.asList(letterName));
		
		String[] letterName1 = "abcdefghijklmnopqrstuvwxyz".split("");
		
		HashSet sets1 = new HashSet(Arrays.asList(letterName1));
		
		sets1.removeAll(sets);
		
		System.out.println(sets);
		System.out.println(sets1);
	}

}
