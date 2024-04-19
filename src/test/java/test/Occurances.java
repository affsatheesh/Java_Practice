package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.xml.stream.events.Characters;

public class Occurances {

	public static void main(String[] args) {
		String str = "aaaaabbbbcccddeaa";
		char[] value = str.toCharArray();

		HashMap<Character, Integer> maps = new HashMap<Character, Integer>();
		for (Character c : value) {

			if(maps.containsKey(c))
			{
				Integer  integer =	maps.get(c);
				maps.put(c, integer+1);
			}
			else {
				maps.put(c,1);
			}
		}
		System.out.println(maps);

	}
}
