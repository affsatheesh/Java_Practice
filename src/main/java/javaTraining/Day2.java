package javaTraining;

public class Day2 {
	
      static int numbers =100;
      int a =10;
      
      public void increement() {
    	  numbers++;
    	  a++;
      }
      
	public static void main(String[] args) {
		
		// Static & Non -static
		
		Day2 day = new Day2();
		day.increement();
		
		Day2 day2 = new Day2();
		System.out.println("Static ==> "+ day2.numbers);
		System.out.println("Non-Static ==> "+day2.a);
		
		
		
		// Data Types
		
	    int myNum = 5;               // integer (whole number)
	    float myFloatNum = 5.99f;    // floating point number
	    char myLetter = 'D';         // character
	    boolean myBool = true;       // boolean
	    String myText = "Hello";     // String    
	    System.out.println(myNum);
	    System.out.println(myFloatNum);
	    System.out.println(myLetter);
	    System.out.println(myBool);
	    System.out.println(myText);
	    


	}

}