package practise;

public class ConsturctorExample {

	int a,b;
	public  ConsturctorExample(){
		System.out.println("This is Default constrcutor");
	}
	public  ConsturctorExample(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println(a+","+b);
		System.out.println("This is parameterized consturctor");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//There are two types of constructor 
		// Default constructor and parameterized constructor
		ConsturctorExample obj1=new ConsturctorExample();
		ConsturctorExample obj2=new ConsturctorExample(10,20);
	}

}
