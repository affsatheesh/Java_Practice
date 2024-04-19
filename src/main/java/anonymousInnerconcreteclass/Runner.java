package anonymousInnerconcreteclass;

public class Runner {

	public static void main(String[] args) {

		Parent parent = new Parent() {
			
			public void marriage()
			{
				System.out.println("My life my rules Runnner class");
			}
		};

		parent.marriage();
	}
}
