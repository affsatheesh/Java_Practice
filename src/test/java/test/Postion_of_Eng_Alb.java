package test;

public class Postion_of_Eng_Alb {

	public static void main(String[] args) {
		
		//ASCII A-> 65 , a-> 65
		
		char value = 'b';
		
		boolean upper = Character.isUpperCase(value);

		if(upper==true)
		{
			int values = (int)value;
			int newValue =values-64;
			System.out.println(newValue);
		}
		else {
			int values = (int)value;
			int newValue =values-96;
			System.out.println(newValue);
		}
	}
}
