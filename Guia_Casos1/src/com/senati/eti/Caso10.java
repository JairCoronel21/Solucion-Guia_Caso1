package com.senati.eti;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int radio = 0;
		
		System.out.println("Ingrese el radio del circulo: ");
		radio = sc.nextInt();
		
		float area = (float) (radio * radio * 3.1416);
		float perimetro = (float) (2 * 3.1416) * radio;
		
		System.out.println("Reultados");
		System.out.println("---------");
		System.out.println("El Área del circulo es:.......: " + area);
		System.out.println("El Perimetro del circulo es:..: " + perimetro);
		
		
		

	}

}
