package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
			String[] names = new String[5];
			names[0] = "Matt";
			names[1] = "Matt1";
			names[2] = "Matt2";
			names[3] = "Matt3";
			names[4] = "Matt4";
		//2. print the third element in the array
				System.out.println(names[2]);
		//3. set the third element to a different value
				names[2] = "Matt5";
		//4. print the third element again
				System.out.println(names[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
				for (int i = 0; i < names.length; i++) {
					names[i] = ("Matt"+i);
				}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
				for (int i = 0; i < names.length; i++) {
					System.out.println(names[i]);
				}
		//7. make an array of 50 integers
				System.out.println("");
				Integer[] numbers = new Integer[50];
		//8. use a for loop to make every value of the integer array a random number
					for (int i = 0; i < numbers.length; i++) {
						Random r = new Random();
						int n = r.nextInt(1000);
						numbers[i] = n;
					}
		//9. without printing the entire array, print only the smallest number on the array
					Integer a = numbers[0];
					for (int i = 1; i < numbers.length; i++) {
						for (int j = 0; j < i; j++) {
							Integer b = numbers[j];
							if(a>b) {
								a = b;
							}
						}
					}
					System.out.println(a);
					System.out.println("");
		//10 print the entire array to see if step 8 was correct
					for (int i = 0; i < numbers.length; i++) {
						System.out.println(numbers[i]);
					}
					System.out.print("");
		//11. print the largest number in the array.
					Integer c = numbers[0];
					for (int i = 1; i < numbers.length; i++) {
						for (int j = 0; j < i; j++) {
							Integer b = numbers[j];
							if(b>c) {
								c = b;
							}
						}
					}
					System.out.println("");
					System.out.println(c);
					
		//12. print only the last element in the array
					System.out.println("");
					System.out.println(numbers[numbers.length-1]);
	}
}
