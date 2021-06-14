package br.com.senai.pessoa;

import java.util.Calendar;

import br.com.senai.endereco.Endereco;

//CLASSE
public class Pessoa extends Endereco {

	// ATRIBUTOS
	private String nome;
	private int anoDeNascimento;
	private int idade;
	private double altura;

	// METODOS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoDeNascimento() {
		return anoDeNascimento;
	}

	public void setAnoDeNascimento(int anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
		setIdade();
	}

	public int getIdade() {
		return idade;
	}

	private void setIdade() {
		Calendar calendar = Calendar.getInstance();

		this.idade = calendar.get(Calendar.YEAR) - getAnoDeNascimento();
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
