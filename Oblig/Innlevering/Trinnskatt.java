package Innlevering;
import static javax.swing.JOptionPane.*;
import java.util.Scanner;


public class Trinnskatt {


public static void main(String args[])

	{
	double tax=0,it;
	Scanner sc=new Scanner(System.in);
	
	tax = Integer.parseInt(showInputDialog(null, "Inntekt: "));
	
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

