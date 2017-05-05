package palindromo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class palabras implements palin{
	
	private String palabra;
	
	public palabras(){
		palabra = null;
	}
	
	public void leer(palabras p1) throws FileNotFoundException{
		String b;
		 String miPath = "C:/Users/alumno/Desktop/PalindromoL/";
		 Scanner sc = new Scanner(new File(miPath+"martinez.txt"));
		 b = sc.next();
		 
		 sc.close();
		 
		 p1.palabra = b;
		 //comparar
		 
	}
	
	public void comparar(palabras p1){
		
	}
}
