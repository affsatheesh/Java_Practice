package test2;

import java.util.HashMap;

public class Testing {

	public static void main(String[] args) {
		String value = "AAssAaaEeeKK";
		
		// output = AAA3aa2E1ee2KK2ss2

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < value.length(); i++) {
			char ch = value.charAt(i);

			if (map.containsKey(ch)) {
				int count = map.get(ch);
				count++;
				map.replace(ch, count);

			} else {
				map.put(ch, 1);
			}
		}

		for (Character key : map.keySet()) {
			System.out.print(key+""+map.get(key));
		}
	}
}
