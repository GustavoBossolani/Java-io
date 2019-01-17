package br.com.gustavo.alura.java.io.testes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) {
		
//		Cliente cliente = new Cliente("Gustavo", "473.455.378-54", "Dev");
//		try {
//			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//			oos.writeObject(cliente);
//			oos.close();
//			System.out.println("Objeto escrito.");
//		}
//		catch (IOException e) {
//			e.printStackTrace();
//		}
		
		try {
			System.out.println("Objeto Seralizado encontrado.");
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
			Cliente cliente = (Cliente) ois.readObject();
			ois.close();
			System.out.println(cliente);
		} 
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			e.getMessage();
		}

	}

}
