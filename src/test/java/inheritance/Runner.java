package inheritance;

public class Runner extends A {

	
	public void school() {
		System.out.println("school method");
	}
	
	public static void main(String[] args) {
		Runner r = new Runner();
		r.school();
	}

}
