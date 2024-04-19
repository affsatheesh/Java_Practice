package test;

import java.util.ArrayList;
import java.util.List;

public class swap {



    public static void main(String[] args) {

    	ArrayList<Integer> value = new ArrayList<Integer>();
    	value.add(20);
    	value.add(30);
    	
    	int firstvalue = value.get(0);
    	int secondvalue = value.get(1);
    	
    	value.set(0, secondvalue);
    	value.set(1, firstvalue);
    	
    	System.out.println(value.get(0));
    	System.out.println(value.get(1));
    }
}
