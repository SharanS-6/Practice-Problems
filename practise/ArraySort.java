package practise;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 4, 5, 1, 3 };
		int n = a.length;
		int k = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (a[i] > a[j]) {
					k = a[i];
					a[i] = a[j];
					a[j] = k;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

	}
}