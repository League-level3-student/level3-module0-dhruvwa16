package _03_More_Array_Fun;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		new MoreArrayFun().method2();
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.

	void method() {
		String[] names = new String[5];
		names[0] = "Matt";
		names[1] = "Matt1";
		names[2] = "Matt2";
		names[3] = "Matt3";
		names[4] = "Matt4";
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	void method1() {
		String[] names = new String[5];
		names[0] = "Matt";
		names[1] = "Matt1";
		names[2] = "Matt2";
		names[3] = "Matt3";
		names[4] = "Matt4";
		for (int i = names.length - 1; i > -1; i--) {
			System.out.println(names[i]);
		}
	}
	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.

	void method2() {
		String[] names = new String[5];
		names[0] = "Matt";
		names[1] = "Matt1";
		names[2] = "Matt2";
		names[3] = "Matt3";
		names[4] = "Matt4";
		for (int i = 0; i < names.length; i += 2) {
			System.out.println(names[i]);
		}
		// 5. Write a method that takes an array of Strings and prints all the Strings
		// in the array
		// in a completely random order. Almost every run of the program should result
		// in a different order.

	}
}