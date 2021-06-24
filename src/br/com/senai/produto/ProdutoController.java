package br.com.senai.produto;

import java.util.List;
import java.util.Scanner;

public class ProdutoController {
	
	private Scanner tec;
	
	public ProdutoController() {
		tec = new Scanner(System.in);
	}
	
	public int leOpcao(){
		System.out.print("> ");
		return tec.nextInt();
	}
	
	public Produto cadastrarProduto() {
		Produto produto = new Produto();
		
		System.out.print("Informe o nome do produto: ");
		produto.setNomeDoProduto(tec.next());
		
		System.out.print("Informe o valor do produto: R$");
		produto.setValorUnitarioDoProduto(tec.nextDouble());
		
		System.out.print("Informe a quantidade: ");
		produto.setQuantidadeDoProduto(tec.nextInt());
		
		produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto() * produto.getQuantidadeDoProduto());
		
		return produto;
	}
	
	public List<Produto> listarProdutos(List<Produto> produtos){
		
		if(produtos.isEmpty()) {
			System.out.println("Não possui produtos cadastrados.");
			return null;
		}
		
		System.out.printf("| %2s | %10s | %13s | %10s | %9s |\n", 
				"Id", "Produto", "Quantidade", "Valor Uni.", "Total");
		
		for(int i = 0; i < produtos.size(); i++) {
			System.out.printf("| %2d | %10s | %13d | R$ %7.2f | R$ %6.2f |\n",
					i + 1,
					produtos.get(i).getNomeDoProduto(),
					produtos.get(i).getQuantidadeDoProduto(),
					produtos.get(i).getValorUnitarioDoProduto(),
					produtos.get(i).getValorTotalDoProduto());
		}
		
		return produtos;
	}
	
	public List<Produto> editarProduto(List<Produto> produtos) {
		
		Produto produto = new Produto();
		listarProdutos(produtos);
		
		if(produtos.isEmpty()) {
			return null;
		}
		
		System.out.print("Informe o Id do produto para editar: ");
		int idProduto = tec.nextInt() - 1;
		
		System.out.println("1) Nome do produto");
		System.out.println("2) Quantidade de produto");
		System.out.println("3) Valor unitário do produto");
		System.out.print("Informe o campo para ser editado: ");
		int opcao = tec.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("--- EDITAR O NOME DO PRODUTO ---");
			System.out.print("Informe o novo nome do produto: ");
			produto.setNomeDoProduto(tec.next());
			
			produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
			produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
			produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());
			
			produtos.set(idProduto, produto);

			break;
			
		case 2:
			System.out.println("--- EDITAR A QUANTIDADE DE PRODUTO ---");
			System.out.print("Informe a quantidade de produto: ");
			produto.setQuantidadeDoProduto(tec.nextInt());
			
			produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
			produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
			
			produto.setValorTotalDoProduto(
					produto.getValorUnitarioDoProduto() * produto.getQuantidadeDoProduto()
					);
			
			produtos.set(idProduto, produto);
			
			break;
			
		case 3:
			System.out.println("--- EDITAR O VALOR UNITÁRIO DO PRODUTO ---");
			System.out.print("Informe o valor do produto: R$");
			produto.setValorUnitarioDoProduto(tec.nextDouble());
			
			produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
			produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
			
			produto.setValorTotalDoProduto(
					produto.getValorUnitarioDoProduto() * produto.getQuantidadeDoProduto()
					);
			
			produtos.set(idProduto, produto);
			break;

		default:
			System.out.println("Opção inválida!");
			break;
		}
		
		
		return produtos;
	}
	
	public void excluirProduto(List<Produto> produtos) {
		listarProdutos(produtos);
		if(produtos.isEmpty()) {
			return;
		}
		
		System.out.println("--- EXCLUIR PRODUTO ---");
		
		System.out.print("Informe o Id do produto para excluir: ");
		int idProduto = tec.nextInt() - 1;
		
		if(produtos.size() <= idProduto) {
			System.out.println("Produto não cadastrado.");
			return;
		}
		
		produtos.remove(idProduto);
	}
	
	public void menu(List<Produto> produtos) {
		System.out.println("\n--- MENU DE PRODUTOS ---");
		System.out.println("1) Cadastrar produto");
		System.out.println("2) Listar produtos");
		System.out.println("3) Editar produto");
		System.out.println("4) Excluir produto");
		
		int opcao = tec.nextInt();
		
		switch (opcao) {
		case 1:
			produtos.add(cadastrarProduto());
			break;
			
		case 2:
			listarProdutos(produtos);
			break;
			
		case 3:
			editarProduto(produtos);
			break;
			
		case 4:
			excluirProduto(produtos);
			break;

		default:
			System.out.println("Opção inválida!");
			break;
		}
		
	}

}


















