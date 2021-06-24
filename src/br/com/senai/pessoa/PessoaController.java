package br.com.senai.pessoa;

import java.util.List;
import java.util.Scanner;

import br.com.senai.endereco.Endereco;
import br.com.senai.produto.Produto;

public class PessoaController {

	private Scanner tec;

	public PessoaController(){
		tec = new Scanner(System.in);
	}

	public int leOpcao(){
		System.out.print("> ");
		return tec.nextInt();
	}

	public Pessoa cadastrarPessoa(){
		Pessoa pessoa = new Pessoa();

		System.out.println("--- CADASTRAR PESSOA ---");
		System.out.print("Informe o nome: ");
		tec.nextLine();
		pessoa.setNome(tec.nextLine());

		System.out.print("Informe o ano de nascimento: ");
		pessoa.setAnoDeNascimento(tec.nextInt());

		System.out.print("Informe a altura: ");
		pessoa.setAltura(tec.nextDouble());
		
		System.out.print("Informe o pais: ");
		tec.nextLine();
		pessoa.setNomeDopais(tec.nextLine());
		
		return pessoa;
	}

	public List<Pessoa> listarPessoas(List<Pessoa> pessoas){
		
		if(pessoas.isEmpty()) {
			System.out.println("Não possui dados para listar.");
			return null;
		}
		
		System.out.println("--- PESSOAS CADASTRADAS ---");

		System.out.printf("| %2s | %20s | %4s | %5s | %6s | %10s |\n",
				"Id", "Nome", "Ano", "Idade", "Altura", "Pais");

		for(int i = 0; i < pessoas.size(); i++){
			System.out.printf("| %2d | %20s | %4d | %5d | %6.2f | %10s |\n",
					i,
					pessoas.get(i).getNome(),
					pessoas.get(i).getAnoDeNascimento(),
					pessoas.get(i).getIdade(),
					pessoas.get(i).getAltura(),
					pessoas.get(i).getNomeDopais());
		}

		return pessoas;
	}
	
	public void menu(List<Pessoa> pessoas) {
		System.out.println("\n--- MENU DE PESSOAS ---");
		System.out.println("1) Cadastrar pessoa");
		System.out.println("2) Listar pessoas cadastradas");
		
		int opcao = tec.nextInt();
		
		switch (opcao) {
		case 1:
			pessoas.add(cadastrarPessoa());
			break;
			
		case 2:
			listarPessoas(pessoas);
			break;

		default:
			System.out.println("Opção inválida!");
			break;
		}
	}
	
}
