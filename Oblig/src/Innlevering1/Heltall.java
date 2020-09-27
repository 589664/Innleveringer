package Innlevering1;
import static javax.swing.JOptionPane.*;


public class Heltall {

	public static void main(String[] args) {
		
		double n = 0;
		double svar = 1;
				
        do {	
        n = Integer.parseInt(showInputDialog("Positivt heltall opp mot 170: "));
        
        if (n<0 || n>170) {
        	 showMessageDialog(null, "Ugyldig tall, prøv igjen");
        }
       
        
        }while(n<0 || n>170);
        
       
        
        if (n >= 0) {
            
            for (double i = 1; i <= n; i++) {
                svar = svar * i;
            }
            
            showMessageDialog(null, svar);

        	}
        
	}
}
