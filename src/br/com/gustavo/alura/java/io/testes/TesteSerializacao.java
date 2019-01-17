package br.com.gustavo.alura.java.io.testes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args){
		
//		String nome = "Gustavo";
//		try {
			//Serializando o objeto 'nome' e escrevendo-o no arquivo (Serialização)
//			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("nome.bin"));
//			oos.writeObject(nome);
//			oos.close();
//		}
//			catch (IOException e) {
//			e.printStackTrace();
//		} 
		
		try {
			//Lendo o arquivo que contem o objeto serializado (Desserializando)
			ObjectInputStream ois = new ObjectInputStream( new FileInputStream("nome.bin"));
			String nome = (String) ois.readObject();
			ois.close();
			System.out.println(nome);
		} 
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
