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
		// ispisuje ve�i
		
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
		
		// Program u�itava cijele brojeve od korisnika
		// sve dok se ne u�ita broj 0. Tada se program zavr�ava
		int c;
	
		
		for(;;) {
			c = Integer.parseInt(JOptionPane.showInputDialog("unesi broj, ako uneses 0 program ce se prekinuti."));
			if(c==0) {
				break;
			}
				
			
		}
		
		// Program od korisnika unosi dva parna broja
		// Program ispisuje njohov zbroj
		
		int m,n;

		
		for(;;) {
			m = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi parni broj"));
			if(m%2==0) {
				break;
			}
				JOptionPane.showInternalMessageDialog(null, "nije parni broj");
			}

		for(;;) {
			n = Integer.parseInt(JOptionPane.showInputDialog("unesi drugi parni broj"));
			if(n%2==0) {
				break;
			}
			JOptionPane.showInternalMessageDialog(null, "nije parni broj");
		}
		System.out.println(m+n);
		
		
		
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
		// Za uneseni broj x = 27353 ispi�ite da li je prim broj
		
		int r = 27353;
		boolean primBroj = true;

		for(int i=2;i<(r/2);i++) {

			if(r%i==0) {
				primBroj = false;
				System.out.println("Broj " + r + " je cjelobrojno djeljiv sa " + i);
				break;
			}			

		}

		if(primBroj) {
			System.out.println("Broj " + r + " je prim broj");
		}else {
			System.out.println("Broj " + r + " nije prim broj");
		}
		
		
		
		
		// Program ispisuje matricu 15 x 15
		// tako da je svaki element matrice broj 0
		

		int matrica[][] =new int[15][15];
		
		for(int i=0;i<matrica.length;i++) {
			System.out.println(Arrays.toString(matrica[i]));
		}
		
					/*drugi nacin
					 * int e=15;
					int f=15;
					
					for (int i = 1; i <= e; i++) {
						for (int j = 1; j <= f; j++) {
							System.out.print(0 + " ");
						}
						System.out.println();
					}*/
		 
		
		//Program od korisnika unosi brojeve
		// sve dok korisnik ne unese broj 0
		//Program ispisuje zbroj svih unesenih brojeva
		
		int d,sum;
		sum=0;
		
		for(;;) {
			d = Integer.parseInt(JOptionPane.showInputDialog("unesi brojeve"));
			if(d==0) {
				break;
			}
			sum=sum+d;
			
		}System.out.println(sum);
		
		// Ispi�i Sve parne brojeve od 3 do 47
		for(int i=3;i<47;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		// Za dva dana broja ispi�ite decimalni dio rezultata
		// djeljenja
		
		double k,l;
		
		k = Double.parseDouble(JOptionPane.showInputDialog("unesi prvi broj"));
		l = Double.parseDouble(JOptionPane.showInputDialog("unesi drugi broj"));
		double rezultat = k/l;
		
		int rez = (int) rezultat;
		
		System.out.println(rezultat - rez);
		
		
		
		// Program ispisuje "Edunova" (ispisuju se i navodnici)
		
		System.out.println("\"Edunova\"");
	}
}
