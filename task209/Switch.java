package task209;

import java.util.Scanner;

public class Switch {



	public static void main(String[] args) {
		
		
		
		System.out.println("enter no of day:");
		Scanner n = new Scanner(System.in);
		int ch = n.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("sunday");
			break;
			
		case 2:
		    System.out.println("monday");
		    break;
		    
		case 3:
		System.out.println("thusday");
		break;
		
		case 4:
		System.out.println("wenesday");
		break;
		
		case 5:
		System.out.println("thursday");
		break;
		
		case 6:
		System.out.println("friday");
		break;
		
		case 7:
		System.out.println("saturday");
		break;
		
		default:
			System.out.println("enter valid choice");
			break;
			
		
		}
		
	}
}
