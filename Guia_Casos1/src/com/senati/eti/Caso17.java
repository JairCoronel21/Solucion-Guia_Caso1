package com.senati.eti;

import java.util.Scanner;

public class Caso17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		float aprobados, desaprobados, retirados, total = 0;
		
		System.out.println("Numero de aprobados: ");
		int num_aprobados = sc.nextInt();
		
		System.out.println("Numero de desaprobados");
		int num_desaprobados = sc.nextInt();
		
		System.out.println("Numero de retirados");
		int num_retirados = sc.nextInt();
		
		
		
		total = num_aprobados + num_desaprobados + num_retirados;
		aprobados = (num_aprobados * 100) / (total);
		desaprobados = (num_desaprobados * 100) / (total);
		retirados = (num_retirados * 100) / (total);
		
		System.out.println("Resulados");
		System.out.println("---------");
		System.out.println("APROBADOS:.............." + aprobados+ "%");
		System.out.println("DESAPROBADOS:..........." + desaprobados+ "%");
		System.out.println("RETIRADOS:.............." + retirados+ "%");

	}

}
