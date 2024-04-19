package test;

public class Vowal {

	public static void main(String[] args) {


		String value = "sathes";
		
		Boolean words = value.toLowerCase().matches(".*[aeiou]*.");
		
		if(words==true)
		{
			System.out.println("value contains vowals");
		}else {
			System.out.println("value do not contains vowals");
		}
	}
}
