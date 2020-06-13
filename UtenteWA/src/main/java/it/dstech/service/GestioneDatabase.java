package it.dstech.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


import it.dstech.models.Utente;

public class GestioneDatabase {
	private EntityManager em;

	public GestioneDatabase(EntityManagerFactory emf) {
		this.em = emf.createEntityManager();
	}

	public Utente aggiungiUtente(Utente utente) {
		em.getTransaction().begin();
		em.persist(utente);
		em.getTransaction().commit();
		return utente;
	}

	public boolean controlloUtente(Utente utente) {
		Utente u = em.find(Utente.class, utente.getNome());
		if (u == null) {
			return false;
		}
		return true;
	}

	public Utente trovaUtente(Utente utente) {
		return em.find(Utente.class, utente.getNome());
	}
	
	public List<Utente> stampaUtente() {
		List<Utente> lista = em.createQuery("SELECT u FROM Patologia u ORDER BY u.nome", Utente.class)
				.getResultList();
		return lista;
	}

}
