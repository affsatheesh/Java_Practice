package test;

public class Element_Present_OR_Not {

	public static void main(String[] args) {
		
		int value[] = {10,20,5,30,40};
		
		for (int i : value) {
			
			if(i==5)
			{
				System.out.println("Its exits");
			}else {
				System.out.println("Its NOT exits");
			}
		}

	}

}
