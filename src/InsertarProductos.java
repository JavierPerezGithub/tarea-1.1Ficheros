import java.io.*;

public class InsertarProductos {	
	
	public static void main(String[] args) {
		Producto prod1 = new Producto(1,"tablon","15cm",10);
		Producto prod2 = new Producto(2,"clavos","1cm",2);
		Producto prod3 = new Producto(3,"barra","3cm",8);
		Producto prod4 = new Producto(4,"mineral","4cm",11);
		Producto prod5 = new Producto(5,"silicona","50cm",20);
		Producto prod6 = new Producto(6,"papel","9cm",22);
		Producto prod7 = new Producto(7,"teflón","60mtrs",80);
		Producto prod8 = new Producto(8,"tijeras","15cm",21);
		Producto prod9 = new Producto(9,"monedero","25cm",20);
		Producto prod10 = new Producto(10,"sillas","45cm",50);
		Producto []productos = {prod1,prod2,prod3,prod4,prod5,prod6,prod7,prod8,prod9,prod10};
		ObjectOutputStream planto = null;	
		ObjectInputStream leo= null;
		
		try {
			planto = new ObjectOutputStream(new FileOutputStream("productos.dat"));
			
			for (int i = 0; i < 10; i++) {
				planto.writeObject(productos[i]);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(planto !=null) {
				try {
					planto.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		try {
			leo = new ObjectInputStream(new FileInputStream("productos.dat"));
			Producto pro = null;
			try {
				pro = (Producto) leo.readObject();
				while(pro !=null) {
					System.out.println("Id: "+pro.getId()+ " Nombre: "+pro.getNombre()
					+" Medidas: "+pro.getMedidas()+" Precio: "+pro.getPrecio());
					pro = (Producto) leo.readObject();
				}
			} catch (ClassNotFoundException e) {
			}			
		} catch (FileNotFoundException e) {
			
		} catch (EOFException e) {			
			
		}catch (IOException e) {			
			
		}finally {
			if(leo !=null) {
				try {
					leo.close();
				} catch (IOException e) {
					
				}
			}
		}
	}	
}
