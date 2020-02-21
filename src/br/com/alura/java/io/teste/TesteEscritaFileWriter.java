package br.com.alura.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		/*
		 * OutputStream fos = new FileOutputStream("lorem2.txt"); 
		 * Writer osw = new OutputStreamWriter(fos); 
		 * BufferedWriter bw = new BufferedWriter(osw);
		 */
		
		FileWriter fw = new FileWriter("lorem2.txt");
		
		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		fw.write(System.lineSeparator());
		fw.write(System.lineSeparator());
		fw.write("awudhaiuhwfaiuhwf");
			
		fw.close();
	}

}
