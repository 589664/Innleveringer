package Innlevering2;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;
import static java.lang.System.*;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import java.util.Arrays;

public class Oppg3 {

	public static void main(String[] args) {
		int [][] matrise1 = { {1,2,3},{3,2,1},{9,8,1} };
		
		int [][] mat1 = { {1,2,3},{3,2,1},{9,8,1} };
		
		int [][] mat2 = { {1,2,3},{3,2,1},{9,8,1} };
		
		
		int tall = 2;
		out.println("Matrise skrivut: ");
		skrivUtmat(matrise1);
		
		out.println(tilStreng(matrise1));
		out.println(tilStreng1(matrise1));
		out.println("");
		out.println("____________________________\nSkalert matrise:");
		skrivUtmat(skaler(tall,matrise1));
		
		out.println("Om matrisene er like = true"
				+ "\nOm matrisene er ulike = false\n"
				+ "Er matrisene like: " + erLik(mat1,mat2));
		out.println("____________________________");
		
		out.println("Speilet matrise diagonalt: ");
		skrivUtmat(speile(matrise1));
		
		
		out.println("Multiplisert mat1 med mat2: ");
		skrivUtmat(multipliser(mat1,mat2));
		
	}
	//a
	public static void skrivUtmat(int[][] matrise) {
		
		for (int[] rad : matrise) {
			for (int a : rad) {
				out.print(a+" ");
			}
				out.println("");
		}
				out.println("____________________________");
	}
	//b
	public static String tilStreng(int[][] matrise) {
		out.println("Matrise som string metode 1: ");
		String txt = "";
		for (int i=0; i < matrise.length; i++) {
			for (int k=0; k < matrise.length; k++)
				txt += matrise[i][k] + " ";
				txt += "\n";
		}
		return txt;
	}

	public static String tilStreng1(int[][] matrise) {
		out.println("____________________________");
		String txt = "Matrise som string metode 2: ";
		for (int[] r: matrise) {
				txt += "\n";
			for (int k : r) {
				txt += k + " ";
			}
			
		}
		
		return txt;
	}
	//c
	public static int[][] skaler(int tall, int[][] matrise){
		int [][] nymatrise = new int [matrise.length][matrise[0].length];
		for (int x=0; x < matrise.length; x++) {
			for (int y=0; y < matrise[x].length; y++)
				nymatrise[x][y] = matrise[x][y] * tall;
		}
		return nymatrise;
	}
	//d
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		if (mat1.length != mat2.length)
			return false;
		for (int x=0; x < mat1.length; x++) {
			if (mat1[x].length != mat2[x].length)
				return false;
			for(int y=0; y < mat1[x].length; y++) {
				int a = mat1[x][y];
				int b = mat2[x][y];
				if (a != b)
					return false;
			}
		}
		return true;
	}
	//e
	public static int[][] speile(int [][] matrise){
		int [][] nymatrise = new int [matrise.length][matrise[0].length];
		for (int x=0; x < matrise.length; x++) {
			for (int y=0; y < matrise[x].length; y++)
				nymatrise[x][y] = matrise[y][x];
		}
		return nymatrise;
	}
	//f
	public static int[][] multipliser(int[][] a, int[][] b){
		int [][] nymatrise = new int [a.length][a[0].length];
		for (int x=0; x < a.length; x++) {
			for (int y=0; y < a[x].length; y++)
				nymatrise[x][y] = a[x][y] * b[x][y];
		}
		return nymatrise;
	}
	
}
