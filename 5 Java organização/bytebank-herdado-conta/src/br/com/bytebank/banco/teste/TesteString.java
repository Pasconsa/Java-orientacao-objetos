/* java lang , teste string */

package br.com.bytebank.banco.teste;

public class TesteString {
	
	public static void main(String[] args) {
		
		//objeto literal= classe (string) nome (referenceia) = java.lang maquina virtual
		String nome = "Alura";
		
		//String outra = nome.replace("A", "a");
		
		String outra = nome.toLowerCase();
		
		System.out.println(nome);
		System.out.println(outra);
	}

}
