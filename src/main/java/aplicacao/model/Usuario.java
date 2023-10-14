package aplicacao.model;

import java.io.Serializable;

public class Usuario implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = -5693839955460228989L;

	private String nome;
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}