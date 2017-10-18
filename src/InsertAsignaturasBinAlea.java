
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class InsertAsignaturasBinAlea {
	static final int TAM_NOM_ASIG = 20;
	static final int TAM_PROF = 10;
	static final int TAM_REG = 68;

	public static void main(String[] args) {
		RandomAccessFile raf = null;
		String[] nombresAsig = {"Programacion", "Bases de Datos", "Lenguajes de Marcas"};
		String[] profesor = {"Pilar", "Susana", "Jairo"};
		int[] horas = {8, 6, 4};
		
		int ultimoID = 0;
		
		try {
			raf = new RandomAccessFile("asignaturas", "rw");
			
			if (raf.length() > 0) {
				raf.seek(raf.length() - TAM_REG);
				ultimoID = raf.readInt();
			}
			
			raf.seek(raf.length());
			
			StringBuffer sbAsig = null;
			StringBuffer sbProf = null;
			for (int i = 0; i < horas.length; i++) {
				raf.writeInt(ultimoID + i + 1); 
				
				sbAsig = new StringBuffer(nombresAsig[i]);
				sbAsig.setLength(TAM_NOM_ASIG);
				raf.writeChars(sbAsig.toString());
				
				sbProf = new StringBuffer(profesor[i]);
				sbProf.setLength(TAM_PROF);
				raf.writeChars(sbProf.toString());
				
				raf.writeInt(horas[i]);				
				
			}
			
			raf.seek(0);
			int id, h;
			String nombreA, nombreP;
			char[] cNombreA = new char[TAM_NOM_ASIG];
			char[] cNombreP = new char[TAM_PROF];
			
			try {
				while (true) {
					id = raf.readInt();
					
					for (int i = 0; i < cNombreA.length; i++) {
						cNombreA[i] = raf.readChar();
					}
					nombreA = new String(cNombreA);
					
					for (int i = 0; i < cNombreP.length; i++) {
						cNombreP[i] = raf.readChar();
					}
					nombreP = new String(cNombreP);
					
					h = raf.readInt();
					
					System.out.println("ID: " + id 
							+ " Asignatura: " + nombreA 
							+ " Profesor: " + nombreP 
							+ " Horas: " + h);
				}
			} catch (EOFException e) {
				System.out.println("Final del fichero");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (raf != null) {
				try {
					raf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
