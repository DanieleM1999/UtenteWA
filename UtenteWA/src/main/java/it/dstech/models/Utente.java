package it.dstech.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Utente {
	@Id
	private String nome;
	private String cognome;
	private String eta;

	public Utente() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	

	
	public String getEta() {
		return eta;
	}

	public void setEta(String eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]";
	}

}
