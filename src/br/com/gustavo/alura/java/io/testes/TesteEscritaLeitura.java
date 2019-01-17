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
		receita.add("2) 1 x�cara de a��car;");
		receita.add("3) 1 x�cara (ch�) de leite;");
		receita.add("4) 1/2 x�caras de farinha de trigo;");
		receita.add("5) 1 colher (ch�) de fermento em p�;");
		receita.add("6) 3 colheres (sopa) de a��car para polvilhar;");
		receita.add("7) 1 colher (sopa) de canela para polvilhar;");
		receita.add("9) 1 litro de �leo para fritar;");
		
		//Fluxo de Sa�da com Arquivo
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
