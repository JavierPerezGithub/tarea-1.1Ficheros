import java.io.*;

public class SustituyeVocal {

	public static void main(String[] args) {
		
		String texto = "texto.txt";
		FileReader fr = null;
		
		try {
			fr = new FileReader(texto);
			int valor=fr.read();
			
			while(valor !=-1) {
				
				if(valor == 101 || valor == 105 || valor == 111 || valor == 117 || valor == 69
				|| valor ==73 || valor ==79 || valor ==85) {
					System.out.print("a");
					valor=fr.read();
				}else {
					System.out.print((char)valor);
		            valor=fr.read();
		            }				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fr !=null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}		
	}
}
