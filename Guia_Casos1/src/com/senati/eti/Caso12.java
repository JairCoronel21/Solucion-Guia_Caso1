package com.senati.eti;

public class Caso12 {

	public static void main(String[] args) {
		String frase = "ESCUELA DE TECNOLOGÍA E INFORMÁTICA";
		
		// substring(pos_ini, pos_fin);
		String pl1 = frase.substring(0, 7);
		String pl2 = frase.substring(11, 21);
		String pl3 = frase.substring(24, 35);
		
		System.out.println("Resultados");
		System.out.println("---------");
		System.out.println("Frase:.......: " + frase);
		System.out.println("Palabra1:.......: " + pl1);
		System.out.println("Palabra2:.......: " + pl2);
		System.out.println("Palabra3:.......: " + pl3);
				

	}

}
