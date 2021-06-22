package novovjezba;

import java.util.Arrays;

public class VjezbaZadaci4 {

	public static void main(String[] args) {
		
		// pomo�u while petlje ispi�ite sve parne brojeve
		// od 3 do 22 uz iznimku brojeva 8 i 10 (njih ne treba ispisati)
						
		
						/*int a=3;
						while(a<=22) {
							if(a%2==0 & !(a==8 || a==10)) {
								System.out.println(a);
							}
							a++;
						}*/
						
						
		
		// s pomo�u do while petlje zbrojite prvih 100 brojeva
		// ispi�ite rzultat
		


		
		// Ulaz u program je niz znakova koji sadr�i
		// imena gradova razdvojeno zarezom
		// Program ispisuje naziv grada koji u sebi ima najmanje znakova
		//Primjer ulaza: "Osijek, Zagreb, Vara�din, Sinj, Donji Miholjac"
		// Sinj
		
		String s = "Osijek, Zagreb, Vara�din, Sinjski lug, Donji Miholjac";
		String[] gradovi = s.split(",");
		int najmanji=Integer.MAX_VALUE;
		int index=0;
		for(int i=0;i<gradovi.length;i++) {
			if(gradovi[i].trim().length()<najmanji) {
				najmanji = gradovi[i].trim().length();
				index=i;
			}
		}
		System.out.println(gradovi[index].trim().toUpperCase());
		for(String grad: gradovi) {
			if(grad.trim().length()==najmanji) {
				System.out.println(grad.trim().toLowerCase());
			}
		}
		
		
		// Ulaz je ime i prezime
		// Izlaz email adresa u Edunovi
		// primjer: Tomislav Jakopec -> tjakopec@edunova.hr
		
		String ime = "Vedran Alagic";
		String[] imeIprezime = ime.split(" ");
		String email="";
				
		email = imeIprezime[0].substring(0,1).toLowerCase()+imeIprezime[1].toLowerCase();
		System.out.println(email + "@edunova.hr");
		
		
		
	}
}
