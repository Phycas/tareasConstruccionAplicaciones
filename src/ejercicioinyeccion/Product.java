package ejercicioinyeccion;

public class Product implements IMyData {
	private String codigo;
	private String name;
	
	public Product(String c, String n) {
		this.codigo = c;
		this.name = n;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getName() {
		return name;
	}
}
