package task209;

import java.util.Scanner;

public class Findarea {
	
	public static void main(String[] args) {
		
		
		System.out.println("please select one from given below\n1.area of triagle\n2.area of ractangle\n3.area of circle");
		Scanner n = new Scanner(System.in);
		int ch = n.nextInt();
		
	switch(ch)
	{
	 
	case 1:
		System.out.println("\nenter height and base of triagle:");
		int h = n.nextInt();
		int b = n.nextInt();
		System.out.println("area of triagle is:"+(h*b/2));
		break;
		
	case 2:
		System.out.println("\nenter length and width of ractangle:");
		int l = n.nextInt();
		int w = n.nextInt();
		System.out.println("area of ractangle is:"+(l*w));
		break;
		
	case 3:
		System.out.println("\n enter the radius of circle:");
		int r = n.nextInt();
		System.out.println("area of circle is:"+(3.14*r*r));
		break;
		
		default:
			System.out.println("\ninvalid choice");
			break;
	
		
	}
	}
}
