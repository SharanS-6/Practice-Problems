package practise;

public class PyramidStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Input
		int n = 5;
		// Pyramid Star Pattern
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();

	}

}
