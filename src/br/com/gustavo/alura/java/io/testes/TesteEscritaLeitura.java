package br.com.gustavo.alura.java.io.testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class TesteEscritaLeitura {

	public static void main(String[] args) throws IOException {
		
		List<String> receita = new ArrayList<>();
		receita.add("1) 2 ovos;");
		receita.add("2) 1 xícara de açúcar;");
		receita.add("3) 1 xícara (chá) de leite;");
		receita.add("4) 1/2 xícaras de farinha de trigo;");
		receita.add("5) 1 colher (chá) de fermento em pó;");
		receita.add("6) 3 colheres (sopa) de açúcar para polvilhar;");
		receita.add("7) 1 colher (sopa) de canela para polvilhar;");
		receita.add("9) 1 litro de óleo para fritar;");
		
		//Fluxo de Saída com Arquivo
		FileOutputStream fos = new FileOutputStream("receita.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		//Fluxo de Entrada com Arquivo
		FileInputStream fis = new FileInputStream("receita.txt");
		InputStreamReader osr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(osr);

		//Escrita
		bw.write("Receita de Bolinho de Chuva:");
		bw.newLine();
		for(int i = 0; i < receita.size(); i++) {
			bw.write(receita.get(i));
			bw.newLine();
		}
		bw.close();

		//Leitura
		String linha = br.readLine();
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		br.close();

	}

}
