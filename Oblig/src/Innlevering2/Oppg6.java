package Innlevering2;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;
import static java.lang.System.*;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import java.util.Arrays;


public class Oppg6 {

	public static void main(String[] args) {
		
		int[] siffer = {1,2,1,2,3,1,7,1,8,2};
		int[] sort = {1,2,3,4,5,6};
		
		String m = tilStreng(siffer);
		out.println("Tabell tekst: " + m);
		
		String k = tilStrengarraymetod(siffer);
		out.println("Tabell tekst: " + k);
	
		skrivUt(siffer);
		
		summer0(siffer);
		int sum = summer0(siffer);
		out.println("Summen av tabell er: " + sum);
		
		int tall=1;
		out.println("Finnes tallet i tabellen? = " + finnesTall(siffer,tall));
		
		out.println("Om første tallet er i tabellen for du frem tallet,"
				+ "\nom ikke for du (-1): " + posisjonTall(siffer,tall));
		
		reverser(siffer);
		out.print("Revers ");
		skrivUt(siffer);
		
		out.println("Sortert tabell returnerer: " + erSortert(sort));
		out.println("Usortert tabell returnerer: " + erSortert(siffer));
		
		out.println("Tabell1 + Tabell2 = " + tilStrengarraymetod(settSammen(sort,siffer)));
		
		out.println("Tabell1 + Tabell2 = " + tilStreng(settSammen(sort,siffer)));
		
	}
	//a
	public static void skrivUt (int[] tabell) {
		out.print("Tabell tall: [ ");
		
		for (int i : tabell) {
			System.out.print(i + " ");
		}
		
		out.println("] ");
	}
	//b
	public static String tilStreng(int[] tabell) {
		String txt = "[";
		for (int i = 0; i < tabell.length; i++) {
			if (i > 0) {
				txt = txt + ",";
			}
			int a = tabell[i];
			txt = txt + a;
		}
		txt = txt + "]";
		return txt;
	}
	
	public static String tilStrengarraymetod (int[] tabell) {
		
		String strArray[] = new String[tabell.length];

		for (int i = 0; i < tabell.length; i++)
			strArray[i] = String.valueOf(tabell[i]);

		return (Arrays.toString(strArray));
	}
	//c
	public static int summer2 (int[] tabell) {
		int sum = 0;
		for (int verdi : tabell) {
			sum += verdi;
		}
			return sum;
	}
	
	public static int summer1 (int[] tabell) {
		int sum = 0;
		int i = 0;
		
		while (i < tabell.length) {
			sum += tabell[i];
			i++;
		}
		return sum;
	}
	
	public static int summer0 (int[] tabell) {
		int sum = 0;
		for (int i = 0; i < tabell.length; i++ ) {
			sum += tabell[i];
		}
		return sum;
	}
	//d
	public static boolean finnesTall (int[] tabell, int tall) {
		
		boolean sann = false;
		int s = 0;
		
		while (!sann && s<tabell.length) {
			if (tall == tabell[s]) {
				sann = true;
			}
			s++;
		}
		return sann;
	}
	//e
	public static int posisjonTall (int[] tabell, int tall) {
		int s = 0;
		int p = 0;
		while (s < tabell.length) {
			if (tall == tabell[0]) {
				p = tabell[0];
			}
			else { 
				p = -1;
			}
			s++;
		}
		return p;
	}
	//f
	public static int[] reverser(int[] tabell) {
		
		int s = tabell.length - 1;
		
		for (int i=0; i<= s/2; i++) {
			int temp = tabell[i];
			tabell[i] = tabell[tabell.length -i -1];
			tabell[tabell.length -i -1] = temp;
			
		}
		return tabell;
	}
	//g
	public static boolean erSortert (int[] tabell) {
		for (int i=0; i < tabell.length -1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				return false;
			}
		}
		return true;
	}
	//h
	public static int[] settSammen(int[] tabell1,int[] tabell2) {
		
		int leng = tabell1.length + tabell2.length;
		
		int[]kombi = new int[leng];
		int s = 0;
		for (int e : tabell1) {
			kombi[s] = e;
			s++;
		}
		
		for (int e : tabell2) {
			kombi[s] = e;
			s++;
		}
		return kombi;
	}
	
	
	
	
	
	
}

	