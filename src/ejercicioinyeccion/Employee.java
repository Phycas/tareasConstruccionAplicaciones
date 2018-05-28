package ejercicioinyeccion;

public class Employee implements IMyData{
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

		
	public Employee(String r, String n){
		this.rut = r;
		this.name = n;
	}
	

}
