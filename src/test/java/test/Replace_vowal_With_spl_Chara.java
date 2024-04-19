package test;

public class Replace_vowal_With_spl_Chara {

	public static void main(String[] args) {

		String value = "I am a infosys Employee";

		String splCharactor = value.replaceAll("[AEIOUaeiou]", "*");

		System.out.println(splCharactor);

		char[] newValue = value.toCharArray();

		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) == 'A' || value.charAt(i) == 'E' || value.charAt(i) == 'I' || value.charAt(i) == 'O'
					|| value.charAt(i) == 'U' || value.charAt(i) == 'a' || value.charAt(i) == 'e'
					|| value.charAt(i) == 'i' || value.charAt(i) == 'o' || value.charAt(i) == 'u') {

				newValue[i] = '*';
			}
		}

		for (char c : newValue) {
			System.out.print(c);
		}
	}
}
