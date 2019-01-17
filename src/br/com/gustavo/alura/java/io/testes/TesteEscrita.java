package br.com.gustavo.alura.java.io.testes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		List<String> nomes = new ArrayList<>();
		nomes.add("Pikachu");
		nomes.add("Goku");
		nomes.add("Naruto");
		nomes.add("Meliodas");
		
		//Fluxo de Sa�da com arquivo
		FileOutputStream fos = new FileOutputStream("texto2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
		BufferedWriter bw = new BufferedWriter(osw);
		
		for (int i = 0; i < nomes.size(); i++) {
			bw.write(nomes.get(i));
			if(i < 3) {
				bw.newLine();
			}
		}
		bw.close();
	}

}
