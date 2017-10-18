import java.io.Serializable;

public class Producto implements Serializable {
	private int id;
	private String nombre;
	private String medidas;
	private float precio;
	
	
	public Producto() {
		super();
	}
	
	public Producto(int id, String nombre, String medias, float precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.medidas = medias;
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMedidas() {
		return medidas;
	}
	public void setMedidas(String medias) {
		this.medidas = medias;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}	
}
