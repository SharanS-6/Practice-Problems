package practise;

public class swaptwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;

//		Swapping using third variable
		int c;
		System.out.println("Numbers before Swaping : " + a + " " + b);
		c = a;
		a = b;
		b = c;
		System.out.println("Numbers After Swaping : " + a + " " + b);

//		Swapping without third variable using + ,-		
		System.out.println("Numbers before Swaping without third variable : " + a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Numbers After Swaping without third variable : " + a + " " + b);
//		Swapping without third variable using * ,/		
		System.out.println("Numbers before Swaping without third variable : " + a + " " + b);
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("Numbers After Swaping without third variable : " + a + " " + b);

	}

}
