package Day_1;

import java.util.Scanner;

public class Magic_Dates {

	public static void main(String[] args) {
		
		int month;
		int day;
		int year;
		
		Scanner canon = new Scanner (System.in);
		
		System.out.println(" Please enter a month with numeric from ");
		month = canon.nextInt();
		
		System.out.println(" Please enter a day with numerice from");
		day = canon.nextInt();
		
		System.out.println(" Please enter a year with numerice from");
		year = canon.nextInt();
		if (month*day==year){
			System.out.println("Date is magic");
			
		}else {
			System.out.println("Date is not mmagic");
		}
			
			
		}
		
	}
	


