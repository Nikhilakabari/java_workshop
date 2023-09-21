package task209;

import java.util.Scanner;

public class Persentage {

	
	public static void main(String[] args) {
		
		System.out.println("enter marks here:");
		Scanner n = new Scanner(System.in);
		
		
		int math = n.nextInt();
		int eng = n.nextInt();
		int sci = n.nextInt();
		int ss = n.nextInt();
		int guj = n.nextInt();
		float per;
		
		per = (math + eng + sci + ss + guj)*100/500;
		
		System.out.println("\npercentage : "+per);
		
		if(per > 75)
		{
			System.out.println("\ndistintion");
		}
		else if(per > 60 && per <= 75)
		{
			System.out.println("\nfirst class");
		}
		else if(per > 50 && per <= 60)
		{
			System.out.println("\n second class");
		}
		else if(per > 35 && per <= 50)
		{
			System.out.println("\npass class");
		}
		else 
		{
			System.out.println("\nfail better luck next time");
		}
		
	}
}
