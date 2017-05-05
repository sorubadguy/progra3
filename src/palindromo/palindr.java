package palindromo;
//import palindromo.palabras;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class palindr{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner s1 = new Scanner(System.in);
		palabras p1= new palabras();
		char resp = 's';
		int a;
		while(resp == 's'){
			
			p1.leer(p1);
			p1.comparar(p1);
			resp = s1.nextLine().charAt(0);
		}
	}
	
	public static int opcion(){
		Scanner s1 = new Scanner(System.in);
		int b = 0;
		do{
			
			b = s1.nextInt();
		}while((b<1)||(b>4));
		return b;
	}
}