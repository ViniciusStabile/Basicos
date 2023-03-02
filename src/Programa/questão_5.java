package Programa;

import java.util.Scanner;

public class questão_5 {

	public static void main(String[] args) {
		
		
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite uma string: ");
	        String frase = sc.nextLine();

	        String invertida = "";

	        for(int i = frase.length() - 1; i >= 0; i--){
	            invertida += frase.charAt(i);
	        }

	        System.out.println("String invertida: " + invertida);
	    
	}

}
