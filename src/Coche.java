import java.io.Serializable;

public class Coche implements Serializable{
	private String modelo;
	private int a�o;
	private double precio;
	public Coche(String modelo, int a�o, double precio) {
		super();
		this.modelo = modelo;
		this.a�o = a�o;
		this.precio = precio;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
