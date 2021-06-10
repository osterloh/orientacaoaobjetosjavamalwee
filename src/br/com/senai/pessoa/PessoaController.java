package br.com.senai.pessoa;

import java.util.List;
import java.util.Scanner;

public class PessoaController {

	private Scanner tec;

	public PessoaController(){
		tec = new Scanner(System.in);
	}

	public int leOpcao(){
		System.out.print("> ");
		return tec.nextInt();
	}

	public void menu(){
		System.out.println("\n--- MENU ---");
		System.out.println("1) Cadastrar pessoa");
		System.out.println("2) Listar pessoas cadastradas");
		System.out.println("9) Sair do sistema");
		System.out.println("-------------------");
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
		System.out.println("--- PESSOAS CADASTRADAS ---");

		System.out.printf("| %20s | %4s | %5s | %6s | %10s |\n",
				"Nome", "Ano", "Idade", "Altura", "Pais");

		for(int i = 0; i < pessoas.size(); i++){
			System.out.printf("| %20s | %4d | %5d | %6.2f | %10s |\n",
					pessoas.get(i).getNome(),
					pessoas.get(i).getAnoDeNascimento(),
					pessoas.get(i).getIdade(),
					pessoas.get(i).getAltura(),
					pessoas.get(i).getNomeDopais());
		}

		return pessoas;
	}
	
	public Endereco cadEndereco() {
		Endereco endereco = new Endereco();
		return endereco;
	}
}
