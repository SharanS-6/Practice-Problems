package practise;

import java.util.*;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Input: ");
		String input = sc.nextLine();
		System.out.println("String before reverse:" + input);

		String reverseword = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reverseword += input.charAt(i);
		}
		System.out.println("String reverse using for loop:" + reverseword);
		// The o/p of the code is in StringBuilder which is preferred for performance
		// since it is not thread safe(asynchronized)
		StringBuilder reverseUsingInbulit = new StringBuilder(input);
		reverseUsingInbulit.reverse();
		System.out.println("String after reversed using inbuilt method: " + reverseUsingInbulit);

		// Used toString method convert from stringBuilder to string ;
		String reverseUsingInbulit1 = new StringBuilder(input).reverse().toString();
		System.out.println("String after reversed using inbuilt method: " + reverseUsingInbulit1);

		sc.close();
	}

}
