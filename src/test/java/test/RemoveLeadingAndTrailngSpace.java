package test;

public class RemoveLeadingAndTrailngSpace {

	public static void main(String[] args) {
		String name =" Sathesh kumar ";
		System.out.println(name.trim());
		
		System.out.println(name.strip());
		
		System.out.println(name.stripLeading());
		System.out.println(name.stripTrailing());
		
		System.out.println(name.replaceAll("^[ \t]+|[ \t]+$", ""));

	}

}
