package test;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse_Number {

	public static void main(String[] args) {


		int number = 12345;
		
		   while (number > 0) {
			   int digit = number % 10;
	            System.out.print(digit);
	            number /= 10;
		   }
	}
}
