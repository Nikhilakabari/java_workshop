package assingment;

import java.util.Scanner;

public class Leap {

	
	public static void main(String[] args) {
		
		System.out.println("enter the year");
		Scanner n = new Scanner(System.in);
		int a = n.nextInt();
		
		if(a%4 == 0)
		{
			System.out.println("leap year");
		}
		else 
		{
			System.out.println("not leap year");
		}
	}
}
