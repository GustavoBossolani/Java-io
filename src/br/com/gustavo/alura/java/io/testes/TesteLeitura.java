package br.com.gustavo.alura.java.io.testes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de Entrada com Arquivo
		FileInputStream fis = new FileInputStream("texto.txt");
		//Essa classe é capaz de ler um FileInputStream
		InputStreamReader inputReader  = new InputStreamReader(fis, "UTF-8");
		//Essa classe é capaz de ler e guardar caracteres de uma linha
		BufferedReader buffReader = new BufferedReader(inputReader);
		
		String linha = buffReader.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = buffReader.readLine();
		}
		
		buffReader.close(); //Fechando conexões do fis e do inputReader
		
	}

}
