package examen.fin;

import java.util.Scanner;

import menu.estudiante.Estudiante;

public class MainAseguradora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String opcion;
		String cedula = "";
		String cedulaABuscar;
		int posicionGuardada = 0;

		do {
			System.out.println("1. Ingresar P�liza");
			System.out.println("2. Actualizar Valor");
			System.out.println("3. Consultar P�liza");
			System.out.println("4. Imprimir Reporte");
			System.out.println("5. SAlIR");
			
			opcion = teclado.nextLine();

			if (opcion.equals("1")) {
				System.out.println("a P�liza General");
				System.out.println("b P�liza Vip");
				String poliza = teclado.nextLine();
				
				if(poliza.equals("a")) {
				System.out.println("Ingrese nombre");
				String nombre = teclado.nextLine();
				System.out.println("Ingrese descripci�n");
				String descripcion = teclado.nextLine();
				System.out.println("Ingrese A�o de vigencia");
			    int anio = teclado.nextInt();
			    System.out.println("Ingrese Valor de P�liza");
				int valor = teclado.nextInt();
			} else if (opcion.equals("2")) {
				System.out.println("Ingrese el numero de c�dula del estudiante a buscar: ");
			} else if (opcion.equals("3")) {
				System.out.println("Ingrese el numero de c�dula del estudiante a buscar: ");
			}
		} else if (opcion.equals("4")) {
			System.out.println("Ingrese el numero de c�dula del estudiante a buscar: ");
		}
	}
		} while (!opcion.equals("3"));
	}

}
