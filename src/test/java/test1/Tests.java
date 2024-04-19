package test1;

public class Tests {

	public static void main(String[] args) {
		String str = "aaAAeeesERR";
		int count = 1;
		for(int i = 0; i <str.length();i=i+count){
		    count =1;
		    for(int j = i+1; j<str.length();j++){
		        if(str.charAt(i) == str.charAt(j)){
		            count = count+1;
		        }
		        else{
		             break;
		        }
		    }
		    // Print here otherwise you will miss the last group of letters
		    // Also if you just want one line use .print instead of println
		    System.out.print(str.charAt(i)+""+count);
		}

	}

}
