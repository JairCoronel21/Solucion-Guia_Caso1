package com.senati.eti;

import java.util.Scanner;

public class Caso20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float venta, incremento = 0;
		
		System.out.println("Escribe el valor de la venta: ");
		venta = sc.nextInt();
        
		incremento = venta + (0.42f * venta) ;
		
		System.out.println("El valor incrementado es :.......: " + incremento);
	}

}
