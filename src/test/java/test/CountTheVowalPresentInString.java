package test;

public class CountTheVowalPresentInString {

	public static void main(String[] args) {
		String name ="Satheshkumar";
		String lowerCaseName = name.toLowerCase();
		int value = lowerCaseName.replaceAll("[^aeiouAEIOU]", "").length();
		System.out.println(value);
	}
}
