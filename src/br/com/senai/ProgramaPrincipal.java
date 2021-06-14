package br.com.senai;

import java.util.ArrayList;
import java.util.List;

import br.com.senai.loja.VendaController;
import br.com.senai.pessoa.Pessoa;
import br.com.senai.pessoa.PessoaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		List<Produto> produtos = new ArrayList<Produto>();
 
		PessoaController pessoaController = new PessoaController();
		ProdutoController produtoController = new ProdutoController();

		boolean sair = false;

		do{
			pessoaController.menu();

			int opcao = pessoaController.leOpcao();

			switch(opcao){
				case 1:
					pessoas.add(pessoaController.cadastrarPessoa());
					break;

				case 2:
					pessoaController.listarPessoas(pessoas);
					break;

				case 9:
					sair = true;
					break;

				default:
					System.out.println("Opção inválida!");
					break;
			}
		}while(!sair);

		System.out.println("Sistema finalizado!");
	}

}
