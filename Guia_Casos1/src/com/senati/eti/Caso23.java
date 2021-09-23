package com.senati.eti;

import java.util.Scanner;

public class Caso23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre del producto: ");
		String nombre = sc.nextLine();
		
		float precio = 0;
		
		System.out.println("Ingrese el precio: ");
		precio = sc.nextFloat();
		
		int cantidad = 0;
		
		System.out.println("Escribe la cantidad: ");
		cantidad = sc.nextInt();
		
		float importe, impuesto, descuento, total = 0;
		
		importe = precio * cantidad;
		impuesto = importe * 0.18f;
		descuento = impuesto * 0.03f;
		total = importe - (descuento + impuesto);
		
		System.out.println("RESUMEN");
		System.out.println("---------");
		System.out.println("IMPORTE:.............." + importe );
		System.out.println("IGV:.................." + impuesto);
		System.out.println("DESCUENTO:............" + descuento);
		System.out.println("TOTAL PRIMA:.........." + total);
		
		

	}

}
