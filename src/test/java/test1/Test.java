package test1;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		String s = "javajajabgtjavahhyjavajavajava";

		String[] value = s.split("java");

		System.out.println(s.replace("java", "A"));

		String values = s.replace("java", "A");

		char[] names = values.toCharArray();

		ArrayList<Character> cha = new ArrayList<Character>();

		for (char c : names) {
			cha.add(c);
		}
		int i = 0;
		for (Character character : cha) {

			if (character.toString().equals("A"))
			{
				i++;
			}
		}
		System.out.println("java count ===> "+ i);
	}

}
