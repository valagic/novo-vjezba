package novovjezba;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class VjezbaZadaci3 {

	public static void main(String[] args) {
		
		//Program unosi 2 broja i ispisuje zbroj
		
		int prviBroj, drugiBroj;
		
		prviBroj = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
		drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("unesi drugi broj"));
		
		System.out.println(prviBroj+drugiBroj);
		
		// program od korisnika unosi 2 decimalna broja
		// ispisuje veæi
		
		float a,b;
		
		a = Float.parseFloat(JOptionPane.showInputDialog("unesi prvi decimalni broj"));
		b = Float.parseFloat(JOptionPane.showInputDialog("unesi drugi decimalni broj"));
		
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
		// Program ispisuje sve brojeve od 100 do 21
		// jedno do drugoga odvojeno zarezom
		
		for(int i=100;i>=21;i--) {
			System.out.println(i);
		}
		
		// Program uèitava cijele brojeve od korisnika
		// sve dok se ne uèita broj 0. Tada se program završava
		int c;
	
		
		for(;;) {
			c = Integer.parseInt(JOptionPane.showInputDialog("unesi broj, ako uneses 0 program ce se prekinuti."));
			if(c==0) {
				break;
			}
				
			
		}
		
		// Program od korisnika unosi dva parna broja
		// Program ispisuje njohov zbroj
		
		// Program unosi 10 cijelih brojeva od korisnika
		// u jednodimenzionalni niz
		// Program ispisuje sve elemente niza
		
						/* jedan od nacina koji nije dobar
						int c,d,e,f,g,h,i,j,k,l;
				
						c = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
						d = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
						e = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
						f = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
						g = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
						h = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
						i = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
						j = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
						k = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
						l = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
						
						int[] niz = {c,d,e,f,g,h,i,j,k,l};
						
						System.out.println(Arrays.toString(niz));*/

		
		int niz[] = new int[10];
		
		for(int i=0;i<niz.length;i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("unesi broj"));
		}
		System.out.println(Arrays.toString(niz));
		
		
		// Prim broj je broj koji je cjelobrojno djeljiv sam s sobom
		// i s broj 1.
		// Za uneseni broj x = 27353 ispišite da li je prim broj
		
		// Program ispisuje matricu 15 x 15
		// tako da je svaki element matrice broj 0
		
		//Program od korisnika unosi brojeve
		// sve dok korisnik ne unese broj 0
		//Program ispisuje zbroj svih unesenih brojeva
		
		// Ispiši Sve parne brojeve od 3 do 47
		
		// Za dva dana broja ispišite decimalni dio rezultata
		// djeljenja
		
		// Program ispisuje "Edunova" (ispisuju se i navodnici)
		
	}
}
