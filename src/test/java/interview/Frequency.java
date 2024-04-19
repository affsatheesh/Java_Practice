package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Frequency {

	public static void main(String[] args) {

		String value = "sathesh";

		char[] name = value.toCharArray();

		ArrayList<Character> list = new ArrayList<Character>();
		for (char c : name) {
			list.add(c);
		}

		Collections.reverse(list);

		for (Character character : list) {
			System.out.print(character);
		}

		Integer array[] = { 10, 80, 50, 9, 60 };

		Arrays.sort(array, Collections.reverseOrder());

		System.out.println(Arrays.toString(array));
	}

}
