package practise;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 5;
        int k=1;
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}

	}

}
