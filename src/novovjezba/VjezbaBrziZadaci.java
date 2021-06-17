package novovjezba;

public class VjezbaBrziZadaci {

	public static void main(String[] args) {
		int t=1, k=1;
		t=++k; 
		k=t++ + k++; 
		System.out.println(k+t); // 7
		
		int a=0, b=2;
		a=b++;
		b= a++ - --b;
		System.out.println(a+b); // 3
		
		int c=2, d=1;
		c=--d;
		d=--c + --d;
		System.out.println(c-d); // 1
		
		int e=1 ,f=3;
		e=f++ + e++;
		f= --f - ++e;
		System.out.println(e+f); // 3
		
		int g=2, h=0;
		g=--g + ++h + g++;
		h=h++ + g++ - --h;
		System.out.println(g-h); //1
		
		int i=2, j=0;
		i=--i + ++j + i++;
		j=j++ + i++ - ++j;
		System.out.println(i-j); //3
		
		int x = 0;
		x = x++ + x--;
		System.out.println(x);
		
		int y = 0;
		y= ++y + --y;
		System.out.println(y);
	}
}



