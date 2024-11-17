package practise;

public class countVowelsAndConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vowels = 0;
		int consonant = 0;

		String input = "Program";

		for (int i = 0; i < input.length(); i++) {
			char a = input.charAt(i);
			if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
				vowels++;
			} else {
				consonant++;
			}
		}
		System.out.println("The count of vowels is " + vowels);
		System.out.println("The count of consonant is " + consonant);

	}

}
