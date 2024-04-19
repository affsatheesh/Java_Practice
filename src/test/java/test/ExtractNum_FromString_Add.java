package test;

public class ExtractNum_FromString_Add {

	public static void main(String[] args) {
		String name ="sathez123";
		
		int total =0;
		for(int i=0;i<name.length();i++)
		{
			char[] chars = name.toCharArray();
			if(Character.isDigit(chars[i]))
			{
				total=total+Character.getNumericValue(chars[i]);
			}
		}
		System.out.println(total);

	}

}
