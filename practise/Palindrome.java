package practise;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Madam";

		String reverse = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reverse += input.charAt(i);

		}
		if (input.equalsIgnoreCase(reverse)) {
			System.out.println("It is Plaindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
