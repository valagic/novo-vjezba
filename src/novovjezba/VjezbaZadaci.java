package novovjezba;

import javax.swing.JOptionPane;

public class VjezbaZadaci {

	public static void main(String[] args) {
		
		/*Zadatak 1
		korisnik unosi cijeli broj
		za parni broj se ispisuje Osijek
		za neparni broj se ispisuje Donji Miholjac*/

		
		
		
		
		/*dodatno zadatak 1
		U slu�aju unosa parnog broja tra�iti unos
		dva cijela broja i ispisati zbroj*/
		
		
		
		
		
		
		
		/*u slu�aju unosa neparnog broja tra�iti unos
		decimalnog broja i ispisati samo cijeli dio/*

		
		
		
		/*Zadatak 2
		Program unosi dva cijela broja od korisnika
		program ispisuje ve�i uneseni broj*/

		
					/*float a,b;
					
					a = Float.parseFloat(JOptionPane.showInputDialog("unesi prvi broj"));
					b = Float.parseFloat(JOptionPane.showInputDialog("unesi drugi broj"));
					
					if (a>b) {
						System.out.println("prvi broj je veci od drugoga");
					}else {
						System.out.println("drugi broj je veci od prvoga");
					}*/
					
					
		
		
		/*Zadatak 3
		Program unosi tri cijela broja od korisnika
		program ispisuje najmanji uneseni broj*/
		
		/*Zadatak 4 - primitivni kalkulator
		Korisnika unosi prvo operaciju:
		1 - zbrajanje
		2 - oduzimanje
		3 - mno�enje
		4 - djeljenje
		za sve ostale unose program ispisuje: GRE�KA i zavr�ava se
		Korisnik unosi dva decimalna broja
		U odnosu na odabranu operaciju program ispisuje rezultat
		Ako je rezultat cijeli broj tada se ispisuje bez .0*/
		
		
		
		
		
		
		
		
		

		/*Zadatak 5
		Program unosi dva cijela broja.
		U slu�aju da je zbroj unesenih brojeva ve�i od 10 
		i razlika prvog i drugog manja od 0 program ispisuje
		Osijek, ina�e ispisuje Donji Miholjac.*/
		
		int a,b,c;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
		b = Integer.parseInt(JOptionPane.showInputDialog("unesi drugi broj"));
		c= a+b;
		
		
	if(c>10 && c<0) {
		System.out.println("osijek");
	}else {
		System.out.println("donji miholjac");
	}
		
		
		
		
		
		
	}
}
