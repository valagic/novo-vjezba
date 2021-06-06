package novovjezba;

public class VjezbanjeSintakse3 {

	public static void main(String[] args) {
		
		boolean provjera = true;
		
		int a = 5;
		int b = 10;
		
		if (a>10)
			System.out.println("a je vece od b " + provjera);
		
		if (a<b)
			System.out.println("a je manje od b " + provjera);
	
		byte  broj= 120;
		byte brojDva = 55;
		
		if (broj<brojDva)
			System.out.println("broj je vece od broja Dva " + provjera);
		
		if (broj>brojDva)
			System.out.println("broj je manje od broja Dva " + provjera);
		
		short aa = 323;
		short bb = 555;
		
		if (aa<bb)
			System.out.println("aa je manje od bb " + provjera);
		
		if (aa>bb)
			System.out.println("aa je vece od bb " + provjera);
		
		long velibroj = 44444444444L;
		long velikBrojDva = 55555555555555l;
		
		if (velibroj<velikBrojDva)
			System.out.println("velibroj je manje od velikBrojDva " + provjera);
		
		if (velibroj>velikBrojDva)
			System.out.println("velibroj je vece od velikBrojDva " + provjera);
			
		float decimalniManji=3.14f;
		float decimalniManjiDva=2.18f;
		
		if (decimalniManji<decimalniManjiDva)
			System.out.println("veldecimalniManjiibroj je manje od decimalniManjiDva " + provjera);
		
		if (decimalniManji>decimalniManjiDva)
			System.out.println("decimalniManji je vece od decimalniManjiDva " + provjera);
		
		double velikiDecimalni=4e10;
		double velikiDecimalniDva=3e10;
		
		if (velikiDecimalni<velikiDecimalniDva)
			System.out.println("velikiDecimalni je manje od velikiDecimalniDva " + provjera);
		
		if (velikiDecimalni>velikiDecimalniDva)
			System.out.println("velikiDecimalni je vece od velikiDecimalniDva " + provjera);
		
		
	}
}
