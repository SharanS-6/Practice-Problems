package practise;

import java.util.*;

public class duplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input:");
		
		String input=sc.nextLine();
		
		char a[]=input.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]='0';
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!='0')
			System.out.print(a[i]);
		}
		
		
		sc.close();

	}

}
