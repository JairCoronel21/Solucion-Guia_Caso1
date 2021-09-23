package com.senati.eti;

import java.util.Scanner;

public class Caso18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int base, altura, area = 0;
		
		System.out.println("Escribe la base del triangulo: ");
		base = sc.nextInt();
		
		System.out.println("Escribe la altura del triangulo: ");
		altura = sc.nextInt();
		
		area = (base * altura) / 2;
		
		System.out.println("El Area del triangulo es:.......: " + area);
		

	}

}
