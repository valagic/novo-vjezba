package novovjezba;

import java.util.Scanner;

public class VjezbanjeScannera {

	public static void main(String[] args) {
		
		//primjer
		Scanner novi = new Scanner(System.in); // kreira scanner objekt
		System.out.println("unesi ime i prezime"); // pita nas da unesemo ime i prezime
		
		String ImeiPrezime = novi.nextLine(); // uzima vrijednost koju unesemo s tipkovnice
		System.out.println("ime i prezime je:" + ImeiPrezime); // ispisuje vrijednost koju smo unijeli

		
		System.out.println();
		
		//primjer
		Scanner noviDva = new Scanner(System.in);
		System.out.println("unesi ime,prezime,godina i placu");
		
		String ime = noviDva.nextLine();
		String prezime = noviDva.nextLine();
		int godina = noviDva.nextInt();
		double placa = noviDva.nextDouble();
		
		System.out.println("ime: " + ime);
		System.out.println("prezime: " + prezime);
		System.out.println("godine: " + godina);
		System.out.println("placa: " + placa);

		
		
		System.out.println();
		
		//primjer
		Scanner noviTri= new Scanner(System.in);
		System.out.println("unesi ime i prezime, placu");
		
		String ImeIPrezime = noviTri.nextLine();
		double placaDva = noviTri.nextDouble();
		
		System.out.println("ime i prezime: " + ImeIPrezime);
		System.out.println("placa:" + placaDva);

		
		System.out.println();
		
		//primjer
		Scanner noviCetiri = new Scanner(System.in);
		System.out.println("unesi prvi broj");
		int prviBroj = Integer.valueOf(noviCetiri.nextLine());
		System.out.println("unesi drugi broj");
		int drugiBroj = Integer.valueOf(noviCetiri.nextLine());
		
		System.out.println("zbroj je : " + (prviBroj+drugiBroj));
		
		System.out.println();
		
		//primjer
		
		// malo drukciji primjera iznad
		Scanner noviPet = new Scanner(System.in);
		System.out.println("Unesi prvi broj");
		
		int prviBrojJedan = noviPet.nextInt();
		System.out.println("unesi drugi broj");
		int drugiBrojdrugi = noviPet.nextInt();
		System.out.println("zbroj je : " + (prviBrojJedan+drugiBrojdrugi));
		
		System.out.println();
		
		//primjer scanner if
		
		Scanner noviSest = new Scanner(System.in);
		
		System.out.println("unesi prvi broj");
		int a = noviSest.nextInt();
		System.out.println("unesi drugi broj");
		int b = noviSest.nextInt();
		
		if(a>b) {
			System.out.println(a + " je veci od " + b);
		}else if(b>a){
			System.out.println(b + " je veci od " + a);
		}else {
			System.out.println("brojevi su jednaki");
		}
		
		
		
	}
}
