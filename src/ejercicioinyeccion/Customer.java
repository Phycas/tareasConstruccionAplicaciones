package ejercicioinyeccion;

public class Customer implements IMyData{

	private String rut;
	private String name;
	
	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

		
	public Customer(String r, String n){
		this.rut = r;
		this.name = n;
	}
	
	
}
