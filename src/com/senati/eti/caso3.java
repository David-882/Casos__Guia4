package com.senati.eti;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Declarar el arreglo
		Integer[] numero = new Integer[5];
		
		System.out.println("INGRESO DE NÚMEROS");
		System.out.println("==================");
		
		// Leer los datos para el arreglo
		for (int j = 0; j < numero.length; j++) {
			System.out.print("Número " + (j + 1) + ": ");
			numero[j] = sc.nextInt();
		}
		
		// Ordenar de forma ascendente
		Arrays.sort(numero);
		
		System.out.println("\nNúmeros Ordenados Ascendentemente");
		System.out.println("===================================");
		for (int j = 0; j < numero.length; j++) 
			System.out.println("Número " + (j + 1) + ": " + numero[j]);
		
		// Ordenar de forma descendente
				Arrays.sort(numero, Collections.reverseOrder());
				
				System.out.println("\nNúmeros Ordenados Descendentemente");
				System.out.println("===================================");
				for (int j = 0; j < numero.length; j++) 
					System.out.println("Número " + (j + 1) + ": " + numero[j]);
		
	}
	
}
