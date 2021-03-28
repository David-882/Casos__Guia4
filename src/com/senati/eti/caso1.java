package com.senati.eti;

public class caso1 {

	public static void main(String[] args) {
		String[] nombre = new String[4];
		
		nombre[0] = "David Arango";
		nombre[1] = "Juan Perez";
		nombre[2] = "Pedro Valdez";
		nombre[3] = "Jhonatan Mendoza";
		
		for (int i = 0; i < nombre.length; i ++)
			System.out.println("Nombre " + (i + 1) + ": " + nombre[i]);
		

	}

}
