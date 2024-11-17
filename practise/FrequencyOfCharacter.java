package practise;

import java.util.Scanner;

public class FrequencyOfCharacter {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Input: ");
		String fre = sc.nextLine();

		char a[] = fre.toCharArray();
		int b[] = new int[fre.length()];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = '0';
					count++;
				}
			}
			b[i] = count;
		}
		System.out.println("Freqency of the charcter : ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] != ' ' && a[i] != '0') {
				System.out.println(a[i] + ": " + b[i]);
			}
		}
		sc.close();
	}
}