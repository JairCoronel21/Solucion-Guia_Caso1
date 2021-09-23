package com.senati.eti;

import java.util.Scanner;

public class Caso16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hora = 0;
		
		System.out.println("Ingrese las horas trabajadas: ");
		hora = sc.nextInt();
        
		float tarifa = 0;
		
		System.out.println("Ingrese la tarifa por hora: ");
		tarifa = sc.nextFloat();
		
		float sueldo, bono, total, totaldo = 0;
		
		sueldo = hora * tarifa;
		bono = sueldo * 1/20;
		total = sueldo + bono;
		totaldo = total / 3.24f;
		
		System.out.println("Resumen tarifario");
		System.out.println("---------");
		System.out.println("Sueldo:.............." + sueldo);
		System.out.println("Bono:................" + bono);
		System.out.println("Total:..............." + total);
		System.out.println("Total en dolares:...." + totaldo);
		
		
		
	}

}
