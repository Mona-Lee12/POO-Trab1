package br.lasalle.oop.trab1;

public class Produto {
	
	String nome;
	String categoria;
	int quantidade;
	double preco;
	boolean esgotado;
	
	void verificarEstoque() { 
		if(quantidade <= 0) {
			esgotado = true;
			System.out.println("O estoque de "+nome+" está esgotado!");
		}else {
			esgotado = false;
			System.out.println("O estoque de "+nome+" é de "+quantidade+" qtd(s).");
		}
	}
	
	void alterarCategoria(String newCategoria) {
		String oldCategoria = categoria;
		categoria = newCategoria;
		System.out.println("Você alterou a categoria de: "+oldCategoria+" para: "+categoria);
	}

}
