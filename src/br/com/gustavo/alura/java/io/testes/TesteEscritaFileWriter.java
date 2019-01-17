package br.com.gustavo.alura.java.io.testes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class TesteEscritaFileWriter  {

	public static void main(String[] args) throws IOException {
		
		List<String> itens= new ArrayList<>();
		itens.add("laranja");
		itens.add("cenoura");
		itens.add("batata");
		itens.add("farinha");
		
		//FileWriter cria um arquivo caso o mesmo n�o exista;
		//caso o arquivo exista ele simplesmente escreve nele
		FileWriter fw = new FileWriter("texto.txt");
		BufferedWriter bw = new BufferedWriter(fw); //ou
//		BufferedWriter bw = new BufferedWriter(new FileWriter("texto.txt"));
		
		//Escrevendo com FileWriter
		for (String item : itens) {
			fw.write(item); //Escrevendo
//			Aqui estamos pulando uma linha, lineSeparator()
//			devolve um caracter especial para quebra de linha
//			de acordo com o sistema operacional
			fw.write(System.lineSeparator());
		}
		
		itens.add("queijo");
		itens.add("presunto");
		itens.add("café");
		itens.add("leite");
		
		
		//Escrevendo usando BufferedWriter 'usando' um FileWriter
		for (String item : itens) {
			bw.write(item);
			bw.newLine(); //Simplificando o pular linha
		}
		
		
		//fechando conex�o
		bw.close();
	}

}
