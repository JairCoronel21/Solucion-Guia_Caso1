package com.senati.eti;

import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lado1, lado2, lado3, perimetro = 0;
		
		System.out.println("Escribe el lado1: ");
		lado1 = sc.nextInt();
		
		System.out.println("Escribe el lado2: ");
		lado2 = sc.nextInt();
		
		System.out.println("Escribe el lado3: ");
		lado3 = sc.nextInt();

		perimetro = lado1 + lado2 + lado3;
		
		System.out.println("El Perimtero del triángulo es :.......: " + perimetro);
		
		
		
	}

}
