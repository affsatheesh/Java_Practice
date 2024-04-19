package polymor;

public class MethodOverLoading {

	public static void main(String[] args) {
		MethodOverLoading.school();
		MethodOverLoading.school("ABC School");
		MethodOverLoading.school(12);
		MethodOverLoading.school("ABC School", 12);
	}

	public static void school() {
		System.out.println("its a school method");
	}

	public static void school(String name) {
		System.out.println("its a school method with String parameter" + name);
	}

	public static void school(int name) {
		System.out.println("its a school method with int parameter" + name);
	}

	public static void school(String name, int value) {
		System.out.println("its a school method with String and Int parameter" + name + value);
	}
}
