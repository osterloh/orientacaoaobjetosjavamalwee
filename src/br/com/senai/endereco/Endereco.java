package br.com.senai.endereco;

//CLASSE
public class Endereco extends Cidade {

	private String nomeDaRua;
	private String nomeDoBairro;
	private String complemento;
	private String numero;

	public String getNomeDaRua() {
		return nomeDaRua;
	}

	public void setNomeDaRua(String nomeDaRua) {
		this.nomeDaRua = nomeDaRua;
	}

	public String getNomeDoBairro() {
		return nomeDoBairro;
	}

	public void setNomeDoBairro(String nomeDoBairro) {
		this.nomeDoBairro = nomeDoBairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
