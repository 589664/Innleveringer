package Innlevering;
import static javax.swing.JOptionPane.*;
public class Helltall {

public static void main(String[] args) {
		
	
		double n = 0;
		double fak = 1;
				
        do {	
        n = Integer.parseInt(showInputDialog("Positivt heltall opp mot 170: "));
        
        if (n<0 || n>170) {
        	 showMessageDialog(null, "Ugyldig tall, prøv igjen");
        }
       
        
        }while(n<0 || n>170);
        
       
        
        if (n > 1) {
            
            for (double i = 1; i <= n; i++) {
                
            }
            
            showMessageDialog(null, n * fak(n-1));
	        
		}  
	}

}
}
