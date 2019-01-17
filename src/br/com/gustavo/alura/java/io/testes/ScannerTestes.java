package br.com.gustavo.alura.java.io.testes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class ScannerTestes {
	
	public static void main(String[] args) throws Exception {
		
		//Este scanner � respons�vel em escanear um arquivo
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			//System.out.println(linha);
			
			//Este scanner � respons�vel em escanear uma linha de caracteres
			Scanner scannerLinha = new Scanner(linha);
			//Definindo internacionaliza��o padr�o de leitura de c�digo
			scannerLinha.useLocale(Locale.US);
			//Fun��o identica ao split(","); por�m com um Delimitador
			scannerLinha.useDelimiter(",");
			
			String tipoConta = scannerLinha.next();
			int agencia = scannerLinha.nextInt();
			int numeroConta = scannerLinha.nextInt();
			String titular = scannerLinha.next();
			double saldo = scannerLinha.nextDouble();
			
			
			//print com boas pr�ticas
			String valorFormatado = String.format
					("%2s: %d-%d, %s - $%.3f", tipoConta, agencia, numeroConta, titular, saldo);
			System.out.println("Valor de Conta formatado: \n" + valorFormatado);
			
			//print com m� pr�tica
			//System.out.println(tipoConta + agencia + numeroConta + titular + saldo);
			
//			Separa��o b�sica de strings com split, atrav�s do regex(",")
//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
			
		}
		scanner.close();
	}
}
