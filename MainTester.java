package br.lasalle.oop.trab1;

public class MainTester {
	
	public static void main(String[] args) {
		
		Cliente clienteNovo = new Cliente();
		clienteNovo.nome = "Mona ";
		clienteNovo.status = "Ativo";
		clienteNovo.alterarStatus("Inativo");
		clienteNovo.consultarStatus();
		
		Produto novoProduto = new Produto();
		novoProduto.nome = "batom";
		novoProduto.categoria = "Maquiagem";
		novoProduto.quantidade = 1;
		novoProduto.verificarEstoque();
		String newCategoria = "Cosmeticos";
		novoProduto.alterarCategoria(newCategoria);
	}

}
