package br.com.gustavo.alura.java.io.testes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class TesteJavaProperties {
	public static void main(String[] args) {
		
		Properties props = new Properties();
		//Adcionando proriedades ao arquivo
		props.setProperty("login", "gustavo.wyd");
		props.setProperty("senha", "1234");
		props.setProperty("email", "gustavo.wyd@outlook.com");		
		try {
			//Salvando o arquivo em na pasta raiz contendo coment�rio
			props.store(new FileWriter("conf.properties"), "Comentário teste Properties");
			System.out.println("Funcionou!, cheque seu arquivo e confira seus Dados.");
		} catch (IOException e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		//Leitura de arquivo
		try {
			props.load(new FileReader("conf.properties"));
			System.out.println("Arquivo encontrado com sucesso!");
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo n�o foi encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("Valores contidos no arquivo.");
		
		List<String> valores = new ArrayList<>();
		valores.add("Login: " + props.getProperty("login"));
		valores.add("Senha: " + props.getProperty("senha"));
		valores.add("Email: " + props.getProperty("email"));
		
		for (String valor : valores) {
			System.out.println(valor);
		}
	}
}
