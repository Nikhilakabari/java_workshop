package task209;

import java.util.Scanner;

public class Calci {

	
	public static void main(String[] args) {
		
		
		System.out.println("enter  any 2 no");
		Scanner n = new Scanner(System.in);
		int a = n.nextInt();
		int b = n.nextInt();
		
		System.out.println("\n please select one given below:\n 1.addition\n2.subtrction\n3.multiplication\n4.division");
		int ch = n.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("\naddition:"+(a+b));
		break;
		
		case 2:
			System.out.println("\nsubtraction"+(a-b));
			break;
			
		case 3:
			System.out.println("\nmultiplication"+(a*b));
			break;
			
		case 4:
			System.out.println("\ndivision"+(a/b));
		break;
		
		default:
			System.out.println("\nenter valid choice");
			break;
		}
	}
}
