import java.io.Serializable;

public class Coche implements Serializable{
	private String modelo;
	private int año;
	private double precio;
	public Coche(String modelo, int año, double precio) {
		super();
		this.modelo = modelo;
		this.año = año;
		this.precio = precio;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
