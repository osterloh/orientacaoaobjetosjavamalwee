package br.com.senai.endereco;

public class Estado extends Pais {

	private String nomeDoEstado;
	private String uf;

	public String getNomeDoEstado() {
		return nomeDoEstado;
	}

	public void setNomeDoEstado(String nomeDoEstado) {
		this.nomeDoEstado = nomeDoEstado;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
