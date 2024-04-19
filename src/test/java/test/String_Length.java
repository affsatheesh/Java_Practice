package test;

public class String_Length {

	public static void main(String[] args) {
		
		
		String name = "sathesh";
		
		char[] value = name.toCharArray();

		int count =0;
		for (char c : value) {
			count++;
		}
		System.out.println(count);
	}

}
