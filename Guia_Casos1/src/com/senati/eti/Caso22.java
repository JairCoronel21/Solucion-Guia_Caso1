package com.senati.eti;

import java.util.Scanner;

public class Caso22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float nota1, nota2, nota3, promedio = 0;
		
		System.out.print("Ingrese nombre del alumno: ");
		String alumno = sc.nextLine();

		
		System.out.println("Escriba la nota 1: ");
		nota1 = sc.nextFloat();
		
		System.out.println("Escriba la nota 2: ");
		nota2 = sc.nextFloat();
		
		System.out.println("Escriba la nota 3: ");
		nota3 = sc.nextFloat();
		
		promedio = (nota1 * 0.2f) + (nota2 * 0.3f) + (nota3 * 0.5f);
		
		System.out.println("El promedio del alumno " + alumno + " es: " + promedio);
	}

}
