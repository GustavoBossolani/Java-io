package br.com.gustavo.alura.java.io.testes;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TesteEscritaPrintStreamPrintWriter  {

	public static void main(String[] args) throws IOException {
		
		long tempoInicial = System.currentTimeMillis();
		
		List<String> objetos= new ArrayList<>();
		objetos.add("cubo");
		objetos.add("tesoura");
		objetos.add("sabonete");
		objetos.add("controle remoto");
		
		PrintStream ps = new PrintStream("texto.txt");
		
		//Escrevendo com FileWriter
		for (String objeto : objetos) {
			ps.println(objeto); //Escrevendo		
			ps.println();//Pulando linha
		}
		
		objetos.add("queijo");
		objetos.add("presunto");
		objetos.add("café");
		objetos.add("leite");
		
		PrintWriter pw = new PrintWriter("texto.txt", "UTF-8");
		for (String objeto : objetos) {
			pw.print(objeto); //Escrevendo
			pw.println(); //Escrenvendo ou Pulando linha
		}
		
		long tempoFinal = System.currentTimeMillis();
		
		//Escrevendo a quantidade de milissegundos atrav�s do m�todo System.currentTimeMillis
		pw.print("Demoramos " + (tempoFinal - tempoInicial) + " milissegundos para executar este programa!");
		
		//Fechando conex�o
		ps.close();
		pw.close();
		
		
	}

}
