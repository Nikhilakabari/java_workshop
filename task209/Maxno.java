package task209;

import java.util.Scanner;

public class Maxno {
	
	public static void main(String[] args) {
		
	

	 Scanner n = new Scanner(System.in);
	 System.out.println("enter the 3 no:");
	 int no1 = n.nextInt();
	 int no2 = n.nextInt();
	 int no3 = n.nextInt();
	 
	 if(no1 > no2)
	 {
		if(no1 > no3)
	   {
        System.out.println("no 1 is max");

	    }
		else if(no3 > no1)
		{
			System.out.println("no3 is max");
		}
	    }
	 else
		 {
		 if(no2 > no3)
		 {
		 System.out.println("no2 is max");
		 }
		 }
	}
}