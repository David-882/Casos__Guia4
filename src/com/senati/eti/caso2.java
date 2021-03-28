package com.senati.eti;

import java.util.Scanner;

public class caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Declarar el arreglo
		int[] numero = new int[5];
		
		System.out.println("INGRESO DE NÚMEROS");
		System.out.println("==================");
		
		int num_mayor = 0, num_menor = 0, sumatoria = 0;
		
		// Leer los datos para el arreglo
		for (int j = 0; j < numero.length; j++) {
			System.out.print("Número " + (j + 1) + ": ");
			numero[j] = sc.nextInt();
			
			if (j == 0) {
				num_mayor = numero[0];
				num_menor = numero[0];
				
			}
			
			if (numero[j] > num_mayor) num_mayor = numero[j];
			
			if (numero[j] < num_menor) num_menor = numero[j];
			
			sumatoria += numero[j];
			
		}

		System.out.println("\n == R E S U L T A D O S == ");
		System.out.println("Número mayor.......: " + num_mayor);
		System.out.println("Número menor.......: " + num_menor);
		System.out.println("Sumatoria.......: " + sumatoria);
	}

}
