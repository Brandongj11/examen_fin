package examen.fin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainAseguradora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String opcion;
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
	    System.out.println("Ingrese codigo de p�liza");
		int codigo = teclado.nextInt();
	    System.out.println("Ingrese Valor de P�liza");
		int valor = teclado.nextInt();
		System.out.println("Ingrese codigo descuento");
		String codigoDescuento = teclado.nextLine();
		System.out.println("Ingrese n�mero de seguro");
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
		System.out.println("Ingrese descripci�n");
	    String descripcionvip = teclado.nextLine();
	    System.out.println("Ingrese A�o de vigencia");
	    int aniovip = teclado.nextInt();
		System.out.println("Ingrese codigo de p�liza");
		int codigovip = teclado.nextInt();
		System.out.println("Ingrese Valor de P�liza");
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
				System.out.println("Ingrese el numero de c�dula del estudiante a buscar: ");
			} else if (opcion.equals("3")) {
				System.out.println("Ingrese el numero de c�dula del estudiante a buscar: ");
		} else if (opcion.equals("4")) {
			System.out.println("Ingrese el numero de c�dula del estudiante a buscar: ");
		}
		}while(!opcion.equals("3"));
	}
}
