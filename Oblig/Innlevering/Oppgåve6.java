package Innlevering;

import java.util.Scanner;


public class Oppgåve6 {


public static void main(String args[])
	{
	double tax=0,it;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Inntekt:");
	
	it=sc.nextDouble();
	
	if(it <= 180800) {
		tax=0;
		System.out.println("Dinn trinnskatt er:"+tax);
		
	} else if (it <= 254500) {
		tax= 0.019 * (it);
		System.out.println("Dinn trinnskatt er:"+tax);
		
	} else if (it <= 639750) {
		tax= 0.042 * (it);
		System.out.println("Dinn trinnskatt er:"+tax);
		
	} else if (it <= 999550) {
		tax= 0.132 * (it);
		System.out.println("Dinn trinnskatt er:"+tax);
		
	} else if (it >= 999550);
		tax= 0.162 * (it); 
		
		sc.close(); 
		  
 
	}
}

