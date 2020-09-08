package Innlevering;
import static javax.swing.JOptionPane.*;


public class Karakterskala {


public static void main(String args[]) {
	
	
	for(int i = 1; i <= 10; i++) {
       showMessageDialog(null, "Elevnr:" + i);
	
		int poeng = Integer.parseInt(showInputDialog("Poengsum: "));
		char karakter = ' ';
	
	if (poeng <= 100 && poeng >= 90) {
			
		showMessageDialog(null, "Karakter: A " + karakter);
	} 
	else if (poeng <= 89 && poeng >= 80) {
		
		showMessageDialog(null, "Karakter B: " + karakter);
	}
	else if (poeng <= 79 && poeng >= 60) {
		
		showMessageDialog(null, "Karakter C: " + karakter);
	}
	else if (poeng <= 59 && poeng >= 50) {
		
		showMessageDialog(null, "Karakter D: " + karakter);
	}
	else if (poeng <= 49 && poeng >= 40) {
		showMessageDialog(null, "Karakter E: " + karakter);
		
	}
	else if (poeng <= 39 && poeng >= 0) {
		showMessageDialog(null, "Karakter F: " + karakter);
	
	} else { 	
	
		showMessageDialog(null, "Ugyldig");
		i--;
		
	
	}}
	
}}
