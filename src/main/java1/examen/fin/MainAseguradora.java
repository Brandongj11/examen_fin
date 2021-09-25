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
			System.out.println("1. Ingresar Póliza");
			System.out.println("2. Actualizar Valor");
			System.out.println("3. Consultar Póliza");
			System.out.println("4. Imprimir Reporte");
			System.out.println("5. SAlIR");
			
			opcion = teclado.nextLine();

			if (opcion.equals("1")) {
				System.out.println("a Póliza General");
				System.out.println("b Póliza Vip");
				String poliza = teclado.nextLine();
				
				if(poliza.equals("a")) {
				System.out.println("Ingrese nombre");
				String nombre = teclado.nextLine();
				System.out.println("Ingrese descripción");
				String descripcion = teclado.nextLine();
				System.out.println("Ingrese Año de vigencia");
			    int anio = teclado.nextInt();
			    System.out.println("Ingrese Valor de Póliza");
				int valor = teclado.nextInt();
			} else if (opcion.equals("2")) {
				System.out.println("Ingrese el numero de cédula del estudiante a buscar: ");
			} else if (opcion.equals("3")) {
				System.out.println("Ingrese el numero de cédula del estudiante a buscar: ");
			}
		} else if (opcion.equals("4")) {
			System.out.println("Ingrese el numero de cédula del estudiante a buscar: ");
		}
	}
		} while (!opcion.equals("3"));
	}

}
