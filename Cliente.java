package br.lasalle.oop.trab1;

public class Cliente {
	
	String nome;
	String cpf; 
	int idade;
	String email;
	String telefone;
	String status;
	
	void alterarStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		System.out.println("Status do cliente "+nome+" foi alterado de: "+oldStatus +" para: "+status);
	}
	
	void consultarStatus() {
		System.out.println("Esse usuário está "+status+"!");
	} 

}
