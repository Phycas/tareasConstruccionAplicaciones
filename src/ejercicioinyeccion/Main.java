package ejercicioinyeccion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IMyData	producto, cliente, empleado; 

		producto = new Product("ASD1234", "Barra de Chocolate");
		cliente = new Customer("19.344.657-6", "Sebastian el Magnánimo");
		empleado = new Employee("17.324.148-9", "Manuel el Increible");
		
		System.out.printf("Nombre Producto: " + producto.getName() + "\n");
		System.out.printf("Nombre Cliente: " + cliente.getName() + "\n");
		System.out.printf("Nombre Empleado: " + empleado.getName() + "\n");
		
		System.out.println("Usando método escribirNombre");
		escribirNombre(cliente);
		
		Rut rutazo = new Rut();
		try {
			rutazo = new Rut(1,"9");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(rutazo.getRut());
		
		
	}
	private static void escribirNombre(IMyData d) {
		System.out.println(d.getName());
	}

}
