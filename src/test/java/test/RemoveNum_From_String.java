package test;

public class RemoveNum_From_String {

    public static void main(String[] args) {

        String input = "Hello123World456";

        String result = test(input);

        System.out.println("Result: " + result);

    }

 

    public static String test(String input) {

        String result = input.replaceAll("\\d", "");

        return result;

    }
}
