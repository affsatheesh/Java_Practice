package test;

import java.util.HashSet;

public class Dubl {

	public static <E> void main(String[] args) {

        String value ="aaabbbee";
		
		HashSet<Character> name = new HashSet<Character>();
		
		for (char e : value.toCharArray()) {
			name.add(e);
		}
		
		StringBuffer buff = new StringBuffer();
		for (Character character : name) {
			buff.append(character);
		}
	
		System.out.println(buff.toString());

	}
}
