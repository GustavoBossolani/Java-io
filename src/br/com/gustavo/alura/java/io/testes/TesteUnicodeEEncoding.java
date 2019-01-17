package br.com.gustavo.alura.java.io.testes;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws Exception {
		
		//Charset charset = Charset.defaultCharset();//Recuperando o Enconding padr�o do sistema operacional
		Charset charset = StandardCharsets.UTF_8;//Definindo o Enconding padr�o
		System.out.println("Enconding: " + charset.displayName());
		
		String s1 = "13� �rg�o Oficial";
		byte[] bytes = s1.getBytes("UTF-8");//Extraindo os bytes de acordo com o Enconding
		//String s2 = new String(bytes, "UTF-8");
		//String s2 = new String(bytes, "US-ASCII");
		//String s2 = new String(bytes, "UTF-16");
		String s2 = new String(bytes, "UTF-8");
		
		System.out.println(s2);
		System.out.println();
		System.out.println("------------------------------------------------");
		TesteEncodingEUnicode();
		
	}
	
	private static void TesteEncodingEUnicode() throws UnsupportedEncodingException {
		String g = "�";
		System.out.println(g.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println("Enconding Padr�o: " + charset.displayName());
		
		byte[] bytes = g.getBytes("UTF-8"); //Transformando uma String em bytes de acordo com o Encoding UTF-8
		String newString = new String(bytes, "UTF-8"); //Criando uma nova String a partir dos bytes criados com o Encoding UTF-8
		System.out.println();
		System.out.format
		("String Criada: %s, Bytes: %s - Enconding: %s", newString , bytes.length,StandardCharsets.UTF_8);
		
		bytes = g.getBytes("UTF-16");
		newString = new String(bytes, "UTF-16");
		System.out.println();
		System.out.format //No construtor do format;
		//estamos retornando por ultimo o Override do método toString do StandardCharsets.
		("String Criada: %s, Bytes: %s - Enconding: %s", newString , bytes.length, StandardCharsets.UTF_16);
	
		bytes = g.getBytes("US-ASCII");
		newString = new String(bytes, "US-ASCII");
		System.out.println();
		System.out.format
		("String Criada: %s, Bytes: %s - Enconding: %s", newString , bytes.length,StandardCharsets.US_ASCII);
	}
}



