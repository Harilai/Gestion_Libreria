package Libreria;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); int opcion = 0;
		
		do {
			System.out.println("-----BIENVENIDO A NUESTA LIBRERIA-----");
			System.out.println(" \n ¿Que desea hacer? \n"
					+ "1. Gestion Usuarios \n"
					+ "2. Gestion Libros \n"
					+ "3. Gestion Prestamos \n"
					+ "4. Salir");
			try {
				
			opcion = Integer.parseInt(entrada.nextLine());
			
			} catch (NumberFormatException ex) {
				System.out.println("Error, formato no valido ( " +ex.getMessage()+ " )");
			} catch (Exception ex) {
				System.out.println("Error no esperado : " +ex.getMessage());
			}
			
			switch(opcion) {
			
			
			case 1 : 
			}
			
			
			
			
		} while (opcion !=4);
		
		
		
	}

}
