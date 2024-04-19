package polymor;

public class MethodOverRiding extends Parent {

	public void marriage() {
		System.out.println("My life my rules");
	}

	public static void main(String[] args) {
		Parent pr = new MethodOverRiding();
		pr.marriage();
		pr.properties();
		

	}
}
