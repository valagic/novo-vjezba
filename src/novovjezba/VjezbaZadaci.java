package novovjezba;

import javax.swing.JOptionPane;

public class VjezbaZadaci {

	public static void main(String[] args) {
		
		/*Zadatak 1
		korisnik unosi cijeli broj
		za parni broj se ispisuje Osijek
		za neparni broj se ispisuje Donji Miholjac*/

							/*int a,b,c;
							a = Integer.parseInt(JOptionPane.showInputDialog("unesi cijeli broj"));
							
							if (a%2 == 0) {
								System.out.println("Osijek");
							}else {
								System.out.println("DOnji Miholjac");
							}*/
							
		
		
		/*dodatno zadatak 1
		U slu�aju unosa parnog broja tra�iti unos
		dva cijela broja i ispisati zbroj*/
		
							/*int a,b,c;
							a = Integer.parseInt(JOptionPane.showInputDialog("unesi cijeli broj"));
							
							if (a%2 == 0) {
								System.out.println("Osijek");
								b = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
								c = Integer.parseInt(JOptionPane.showInputDialog("unesi drugi broj"));
								System.out.println(b+c);
								
							}else {
								System.out.println("DOnji Miholjac");
							}
		*/
		
		
		
		
		/*u slu�aju unosa neparnog broja tra�iti unos
		decimalnog broja i ispisati samo cijeli dio/*

		
		
		
		
		
		
		/*Zadatak 2
		Program unosi dva cijela broja od korisnika
		program ispisuje ve�i uneseni broj*/

		
					/*int a,b;
					
					a = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
					b = Integer.parseInt(JOptionPane.showInputDialog("unesi drugi broj"));
					
					if (a>b) {
						System.out.println("prvi broj je veci od drugoga");
					}else {
						System.out.println("drugi broj je veci od prvoga");
					}*/
					
					
		
		
		/*Zadatak 3
		Program unosi tri cijela broja od korisnika
		program ispisuje najmanji uneseni broj*/
		
					/*int a,b,c;
					
					a = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
					b = Integer.parseInt(JOptionPane.showInputDialog("unesi drugi broj"));
					c = Integer.parseInt(JOptionPane.showInputDialog("unesi treci broj"));
					
					if(a<b) {
						System.out.println(a);
					}else if (b<c) {
						System.out.println(b);
					}else {
						System.out.println(c);
					}
		*/
		
		
		
		
		
		
		
		
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
		
		int operacija;
		double a,b;
		
		
		operacija = Integer.parseInt(JOptionPane.showInputDialog("unesi operaciju - 1 zbranjanje, 2 oduzimanje, 3 mnozenje, 4 djeljenje"));

		if (operacija<=0 || operacija>=5) {
			System.out.println("Greska");
		}
		
		a = Double.parseDouble(JOptionPane.showInputDialog("unesi prvi broj"));
		b = Double.parseDouble(JOptionPane.showInputDialog("unesi drugi broj"));
		
		double operacijaZbroj = a+b;
		double operacijaOduzimanje = a-b;
		double operacijaMnozenje = a*b;
		double operacijaDjeljenje = a/b;
		
		int Zbroj = (int)operacijaZbroj;
		int Oduzimanje = (int)operacijaOduzimanje;
		int Mnozenje = (int)operacijaMnozenje;
		int Djeljenje = (int)operacijaDjeljenje;
		
		if (operacija == 1) {
			System.out.println("zbranjanje");
			if (Zbroj == operacijaZbroj ) {
				System.out.println(Zbroj);
			}else {
				System.out.println(operacijaZbroj);
			}
		}else if (operacija == 2) {
			System.out.println("oduzimanje");
			if (Oduzimanje == operacijaOduzimanje ) {
				System.out.println(Oduzimanje);
			}else {
				System.out.println(operacijaOduzimanje);
			}
		}else if (operacija == 3) {
			System.out.println("mnozenje");
			if (Mnozenje == operacijaMnozenje ) {
				System.out.println(Mnozenje);
			}else {
				System.out.println(operacijaMnozenje);
			}
		}else if(operacija == 4) {
			System.out.println("djeljenje");
			if (Djeljenje == operacijaDjeljenje ) {
				System.out.println(Djeljenje);
			}else {
				System.out.println(operacijaDjeljenje);
			}
		}
		

		
		
		
		
		
		
		
		

		/*Zadatak 5
		Program unosi dva cijela broja.
		U slu�aju da je zbroj unesenih brojeva ve�i od 10 
		i razlika prvog i drugog manja od 0 program ispisuje
		Osijek, ina�e ispisuje Donji Miholjac.*/
		
					/*	int a,b,c;
						
						a = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
						b = Integer.parseInt(JOptionPane.showInputDialog("unesi drugi broj"));
						c= a+b;
						
						
					if(c>10 && c<0) {
						System.out.println("osijek");
					}else {
						System.out.println("donji miholjac");
					}*/
						
		
		
		
		
		
	}
}
