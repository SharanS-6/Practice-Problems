package practise;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input: ");
		String Setence = sc.nextLine();
		System.out.println("Setence before Reverseing: " + Setence);

		String a[] = Setence.split(" ");

//		Reverse the sentence
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");

		}

//		Reverse the word keep the sentence as it
		String reverseword = "";
		for (int i = 0; i < a.length; i++) {
			String b = a[i];
			String c = "";
			for (int j = b.length() - 1; j >= 0; j--) {
				c += b.charAt(j);
			}
			reverseword = reverseword+c+" ";
		}
		System.out.println(reverseword);

		sc.close();
	}

}
