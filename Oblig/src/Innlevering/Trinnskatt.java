package Innlevering;
import static javax.swing.JOptionPane.*;

public class Trinnskatt {

	public static void main(String[] args) {
		
		double inte= Integer.parseInt(showInputDialog("Skriv din inntekt: "));
		double tax= 0;
		
		if(inte <= 180800) {
			tax=0;
			showMessageDialog(null, "Dinn trinnskatt er: "+tax);
			
		} else if (inte <= 254500) {
			tax= 0.019 * (inte);
			showMessageDialog(null, "Dinn trinnskatt er: "+tax);
			
		} else if (inte <= 639750) {
			tax= 0.042 * (inte);
			showMessageDialog(null, "Dinn trinnskatt er: "+tax);
			
		} else if (inte <= 999550) {
			tax= 0.132 * (inte);
			showMessageDialog(null, "Dinn trinnskatt er: "+tax);
			
		} else if (inte >= 999550) {
			tax= 0.162 * (inte); 
			
		} else {
			showMessageDialog(null, "Eg nekter å godta det du skriv!");
		
		
		}	
			
	}

}
