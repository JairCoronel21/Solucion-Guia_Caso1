package com.senati.eti;

import java.util.Scanner;

public class Caso24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float m1, m2, m3, rpta1, rpta2, rpta3 = 0;
		
		System.out.println("Ingrese el primer monto: ");
		m1 = sc.nextFloat();
		
		System.out.println("Ingrese el segundo monto: ");
		m2 = sc.nextFloat();
		
		System.out.println("Ingrese el tercer monto: ");
		m3 = sc.nextFloat();

		rpta1 = (m1 / 5) + (m2 * 0.20f);
		rpta2 = (m3 + (m3 * 0.60f )) / 2;
		rpta3 = (m1 + m2 + m3 ) - ((m1 + m2 + m3) * 0.08f);
		
		System.out.println("RESULTADOS");
		System.out.println("---------");
		System.out.println("Monto 1:.............." + m1);
		System.out.println("Monto 2:.............." + m2);
		System.out.println("Monto 3:.............." + m3);
		System.out.println("Resultado 1:.........." + rpta1);
		System.out.println("Resultado 2:.........." + rpta2);
		System.out.println("Resultado 3:.........." + rpta3);
		
       
	}

}

		