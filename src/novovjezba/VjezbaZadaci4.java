package novovjezba;

import java.util.Arrays;

public class VjezbaZadaci4 {

	public static void main(String[] args) {
		
		// pomoæu while petlje ispišite sve parne brojeve
		// od 3 do 22 uz iznimku brojeva 8 i 10 (njih ne treba ispisati)
						
		
						/*int a=3;
						while(a<=22) {
							if(a%2==0 & !(a==8 || a==10)) {
								System.out.println(a);
							}
							a++;
						}*/
						
						
		
		// s pomoæu do while petlje zbrojite prvih 100 brojeva
		// ispišite rzultat
		


		
		// Ulaz u program je niz znakova koji sadrži
		// imena gradova razdvojeno zarezom
		// Program ispisuje naziv grada koji u sebi ima najmanje znakova
		//Primjer ulaza: "Osijek, Zagreb, Varaždin, Sinj, Donji Miholjac"
		// Sinj
		
		String gradovi = "Osijek, Zagreb, Varaždin, Sinj, Donji Miholjac";
		String[] niz = gradovi.split(",");
		
		System.out.println(Arrays.toString(niz));
		
		
		
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
