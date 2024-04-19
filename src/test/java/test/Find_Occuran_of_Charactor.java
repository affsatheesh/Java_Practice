package test;

public class Find_Occuran_of_Charactor {

	public static void main(String[] args) {
		
		String value ="SatheshkumAr";
		String lowcaseValue = value.toLowerCase();
		
		char[] findValue = lowcaseValue.toCharArray();

	    int	count =0;
		for (char c : findValue) {
			if(c=='a')
			{
				count++;
			}else {
				
			}
		}
		System.out.println(count);
		
		
	}

}
