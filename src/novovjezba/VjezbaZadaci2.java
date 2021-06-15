package novovjezba;

import javax.swing.JOptionPane;

public class VjezbaZadaci2 {

	public static void main(String[] args) {
		
		
		//Program uèitava 5 decimalnih brojeva u niz
		//Program ispisuje prvi i posljednji element niza
		
		double a,b,c,d,e;
		
		a = Double.parseDouble(JOptionPane.showInputDialog("unesi prvi decimalni broj"));
		b = Double.parseDouble(JOptionPane.showInputDialog("unesi prvi decimalni broj"));
		c = Double.parseDouble(JOptionPane.showInputDialog("unesi prvi decimalni broj"));
		d = Double.parseDouble(JOptionPane.showInputDialog("unesi prvi decimalni broj"));
		e = Double.parseDouble(JOptionPane.showInputDialog("unesi prvi decimalni broj"));
		
		double niz[] = {a,b,c,d,e};
		System.out.println(niz[0]+ " " +niz[4]);
		
		
		
		//Program preko args parametara prima dva cijela broja
		//Program ispisuje zbroj primljenih brojeva
		
		//Korisnik unosi cijeli broj
		//Program ispisuje broj 7 jedno ispod drugog
		//onoliko puta koliko je korisnik unio
		
		// program ispisuje sve parne brojeve od 1 do 55
		// U petlji obavezno koristiti vrijednosti 1 i 55
		
		/*
		//loše rješenje
		public static void main(String[] args) {
			for(int i=2;i<=54;i+=2) {
				System.out.println(i);
			}
		}
		*/
		
		
		//Program unosi 5 cijelih brojeva u niz
		//Program ispisuje najveæi uneseni broj
		
		
		
		
		
	}
}
