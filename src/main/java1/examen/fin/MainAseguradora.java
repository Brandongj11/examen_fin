package examen.fin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainAseguradora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String opcion;
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
	    System.out.println("Ingrese codigo de póliza");
		int codigo = teclado.nextInt();
	    System.out.println("Ingrese Valor de Póliza");
		int valor = teclado.nextInt();
		System.out.println("Ingrese codigo descuento");
		String codigoDescuento = teclado.nextLine();
		System.out.println("Ingrese número de seguro");
		int numeroseguro = teclado.nextInt();
		List<PolizaGeneral> listPoliza = new ArrayList<PolizaGeneral>();
		PolizaGeneral cliente = new PolizaGeneral();
		cliente.setNombre(nombre);
		cliente.setDescripcion(descripcion);
		cliente.setAnioVigencia(anio);
	    cliente.setCodigoDescuento(codigoDescuento);
		 listPoliza.add(cliente);
		} else if(poliza.equals("b")) {
		System.out.println("Ingrese nombre");
		String nombrevip = teclado.nextLine();
		System.out.println("Ingrese descripción");
	    String descripcionvip = teclado.nextLine();
	    System.out.println("Ingrese Año de vigencia");
	    int aniovip = teclado.nextInt();
		System.out.println("Ingrese codigo de póliza");
		int codigovip = teclado.nextInt();
		System.out.println("Ingrese Valor de Póliza");
		int valorvip = teclado.nextInt();
		System.out.println("Ingrese beneficio");
		String beneficio = teclado.nextLine();
		List<PolizaVip> listPolizaVip = new ArrayList<PolizaVip>();
		PolizaVip clientevip = new PolizaVip();
		clientevip.setNombrevip(nombrevip);
		clientevip.setDescripcionvip(descripcionvip);
		clientevip.setAnioVigenciavip(aniovip);
		clientevip.setBeneficio(beneficio);
		listPolizaVip.add(clientevip);
				
			} else if (opcion.equals("2")) {
				System.out.println("Ingrese el numero de cédula del estudiante a buscar: ");
			} else if (opcion.equals("3")) {
				System.out.println("Ingrese el numero de cédula del estudiante a buscar: ");
		} else if (opcion.equals("4")) {
			System.out.println("Ingrese el numero de cédula del estudiante a buscar: ");
		}
		}while(!opcion.equals("3"));
	}
}
