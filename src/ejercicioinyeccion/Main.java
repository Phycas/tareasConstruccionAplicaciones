package ejercicioinyeccion;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IMyData	producto, cliente, empleado; 
		IMyData d;
		List<IMyData> lista = new ArrayList<IMyData>();
		IWs wsMock = new WebServiceMock();
		//llenando variables IMyData
		producto = new Product("ASD1234", "Barra de Chocolate");
		cliente = new Customer("19.344.657-6", "Sebastian el Magnánimo", 100.0, wsMock);
		empleado = new Employee("17.324.148-9", "Manuel el Increible");
		//llenando la lista
		lista.add(producto);
		lista.add(cliente);
		lista.add(empleado);
		
		System.out.printf("Nombre Producto: " + producto.getName() + "\n");
		System.out.printf("Nombre Cliente: " + cliente.getName() + "\n");
		System.out.printf("Nombre Empleado: " + empleado.getName() + "\n");
		System.out.println("");// salto de linea
		
		System.out.println("Usando método escribirNombre(IMyData)");
		d = producto;
		escribirNombre(d);
		d = cliente;
		escribirNombre(d);
		d= empleado;
		escribirNombre(d);
		System.out.println("");// salto de linea
		
		System.out.println("Usando método escribirNombres(List<IMyData>)");
		escribirNombres(lista);
//		Rut rutazo = new Rut();
//		try {
//			rutazo = new Rut(1,"9");
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}
//		System.out.println(rutazo.getRut());
		
		
	}
	private static void escribirNombre(IMyData d) {
		System.out.println(d.getName());
	}

	private static void escribirNombres(List<IMyData> lista) {
		// foreach loop
		for (IMyData ele : lista) {
			escribirNombre(ele);
		}
	}
}
