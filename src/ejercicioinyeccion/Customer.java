package ejercicioinyeccion;

public class Customer implements IMyData{

	private String rut;
	private String name;
	private Double amount;
	private IWebService _ws;
	
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

		
	public Customer(String r, String n, Double a, IWebService in){
		this.rut = r;
		this.name = n;
		this.amount = a;
		this._ws = in;
	}
	 public Double getAmount() {
		 return this.amount * _ws.getTax();
	 }
	 
	 public String getAmountSTR() {
		 return "Monto de " + this.name + " :" + getAmount().toString();
	 }
	
}
