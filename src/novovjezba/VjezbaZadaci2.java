package novovjezba;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class VjezbaZadaci2 {

	public static void main(String[] args) {
		
		
		//Program uèitava 5 decimalnih brojeva u niz
		//Program ispisuje prvi i posljednji element niza
		
		/*double a,b,c,d,e;
		
		a = Double.parseDouble(JOptionPane.showInputDialog("unesi prvi decimalni broj"));
		b = Double.parseDouble(JOptionPane.showInputDialog("unesi drugi decimalni broj"));
		c = Double.parseDouble(JOptionPane.showInputDialog("unesi treci decimalni broj"));
		d = Double.parseDouble(JOptionPane.showInputDialog("unesi cetvrti decimalni broj"));
		e = Double.parseDouble(JOptionPane.showInputDialog("unesi peti decimalni broj"));
		
		double niz[] = {a,b,c,d,e};
		System.out.println(niz[0]+ " " +niz[4]);*/
		
		
		
		//Program preko args parametara prima dva cijela broja
		//Program ispisuje zbroj primljenih brojeva
		
		
		
		
		
		
		
		
		//Korisnik unosi cijeli broj
		//Program ispisuje broj 7 jedno ispod drugog
		//onoliko puta koliko je korisnik unio
		
		/*int g;
		
		g = Integer.parseInt(JOptionPane.showInputDialog("unesi jedan cijeli broj"));
		
		for(int i=0;i<g;i++) {
			System.out.println("ispisi broj 7");
		}*/
		
		
		
		
		// program ispisuje sve parne brojeve od 1 do 55
		// U petlji obavezno koristiti vrijednosti 1 i 55
		
		
		/*for(int i=1;i<=55;i++) {
			if(i%2==0) {
				System.out.println(i);
			}else {
				System.out.println("nije parni broj");
			}
		}*/
		
		
		
		
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
		
		int prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("unesi drugi broj"));
		int treciBroj = Integer.parseInt(JOptionPane.showInputDialog("unesi treci broj"));
		int cetvrtiBroj = Integer.parseInt(JOptionPane.showInputDialog("unesi cetvrti broj"));
		int petiBroj = Integer.parseInt(JOptionPane.showInputDialog("unesi peti broj"));
		
		int[] niz = {prviBroj,drugiBroj,treciBroj,cetvrtiBroj,petiBroj};
		int najveciBroj = 0;
		
		System.out.println(Arrays.toString(niz));
		
		for(int i=0;i<niz.length;i++) {
			if(niz[i] > najveciBroj) {
				najveciBroj = niz[i];
			}
			
		}System.out.println(najveciBroj);
		
	}
}
