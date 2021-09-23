package com.senati.eti;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int lado = 0;
		
		System.out.println("Ingrese el lado del cuadrado: ");
		lado = sc.nextInt();
		
		int area = (int) Math.pow(lado, 2);
		int perimetro = lado * 4;
		
		System.out.println("Reultados");
		System.out.println("---------");
		System.out.println("El Área del cuadrado es:....... " + area);
		System.out.println("El Perimetro del cuadrado es:.. " + perimetro);
		

	}

}
