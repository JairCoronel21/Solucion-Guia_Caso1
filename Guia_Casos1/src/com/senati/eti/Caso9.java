package com.senati.eti;

import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int lado1 = 0;
		
		System.out.println("Ingrese el lado1 del rectángulo: ");
		lado1 = sc.nextInt();
		
		int lado2 = 0;
		
		System.out.println("Ingrese el lado2 del rectángulo");
		lado2 = sc.nextInt();
		
		int area = (int) lado1 * lado2;
		int perimetro = lado1 * 2 + lado2 * 2;
		
		System.out.println("Reultados");
		System.out.println("---------");
		System.out.println("El Área del rectángulo es:.......: " + area);
		System.out.println("El Perimetro del rectángulo es:..: " + perimetro);
		
		
	}

}
