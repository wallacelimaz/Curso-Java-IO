package br.com.alura.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(new File("contas.csv"));
	
		while(scanner.hasNextLine()) {
			
			String linha = scanner.nextLine();
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			while(linhaScanner.hasNext()) {
				
				System.out.println(linhaScanner.next());
				
			}
			
			linhaScanner.close();
			
			System.out.println(linha);
			
		}
		
		scanner.close();
	}

}
