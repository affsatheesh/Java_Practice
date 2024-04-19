package Encapsulations;

public class Parent {

	public static void main(String[] args) {

		Childrens child = new Childrens();
		
		System.out.println(child.getName());
		
		child.setName("kumar");
		System.out.println(child.getName());
		
		
	}
}
