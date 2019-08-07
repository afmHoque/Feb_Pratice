package Day_1;

import java.util.Scanner;

public class Roman_Numera {

	public static void main(String[] args) {
		
		int num ;
		Scanner canon = new Scanner(System.in);
		System.out.println("Please enter a number within the range of 1 through 10:");
		
		num = canon.nextInt();
		
		if(num<1 || num>10) {
			System.out.println("please enter a number throw 1 to 10");
			
		
		} else if(num ==1) {
			System.out.println(num +" Roman numerial is I");
		}else if(num ==2) {
			
			System.out.println(num +" Roman numerial is II");
			
		}else if(num ==3) {
			System.out.println(num +" Roman numerial is III");
			
		}else if(num ==4) {
		
			System.out.println(num +" Roman numerial is IV");
	}else if(num ==5) {
		
		System.out.println(num +" Roman numerial is V"); 
	}else if(num ==6) {
			
	    System.out.println(num +" Roman numerial is VI"); 
	}else if(num ==7) {
				
		System.out.println(num +" Roman numerial is VII"); 
	}else if(num ==8) {
					
		System.out.println(num +" Roman numerial is VIII"); 
	}else if(num ==9) {
						
		System.out.println(num +" Roman numerial is IX"); 
	}else if(num ==10) {
							
	    System.out.println(num +" Roman numerial is X"); 
		}else {
			System.out.println(" Please enter the is number the range of 1 through 10");
			
		}
	}
}
