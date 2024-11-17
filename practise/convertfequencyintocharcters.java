package practise;

public class convertfequencyintocharcters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "a2b3c4";

		System.out.println("Before converting frequency into characters: " + s);
		char a[] = s.toCharArray();
		System.out.print("After converting frequency into characters: ");
		for (int i = 0; i < a.length; i++) {
//			check the charater is digit in ascii and also checks the i+1 less than length of the char array
			if (a[i + 1] > '0' && a[i + 1] < '9' && ((i + 1) <= a.length)) {
				int count = a[i + 1] - '0';
				for (int j = 0; j < count; j++) {
					System.out.print(a[i]);
				}
				i++;
			}

		}
	}

}
