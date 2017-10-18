import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FicheroObjectoBinarioAleatorio {
	private static int TAM_MODEL = 20;
	public static void main(String[] args) {
		
		/*
		 * Crea una clase java que almacene 10 coches * en un fichero binario aleatorio
		 *  y después muestre ese fichero por pantalla. *de cada coche se desea saber modelo,
		 *  año de fabricación y precio, crea los arrays por código, no es necesario
		 *  introducirlo por pantalla. El modelo tendrá como máximo 20 caracteres.
		 */
		Coche c1 = new Coche("coche 1", 1990 , 1000);
		Coche c2 = new Coche("coche 2", 1991 , 1000);
		Coche c3 = new Coche("coche 3", 1992 , 1000);
		Coche c4 = new Coche("coche 4", 1993 , 1000);
		Coche c5 = new Coche("coche 5", 1994 , 1000);
		Coche c6 = new Coche("coche 6", 1905, 1000);
		Coche c7 = new Coche("coche 7", 1996 , 1000);
		Coche c8 = new Coche("coche 8", 1997 , 1000);
		Coche c9 = new Coche("coche 9", 1998 , 1000);
		Coche c10 = new Coche("coche 10", 1999 , 1000);
		Coche [] coches = {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10};
		
		RandomAccessFile raf = null;
		
		try {
			raf = new RandomAccessFile("coches.dat", "rw");
			for (int i = 0; i < coches.length; i++) {
				
				raf.writeChars(coches[i].getModelo());
				raf.writeInt(coches[i].getAño());
				raf.writeDouble(coches[i].getPrecio());
			}
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
