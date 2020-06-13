package it.dstech.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

import javax.mail.MessagingException;
import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import it.dstech.models.Utente;
import it.dstech.service.GestioneDatabase;

@MultipartConfig
@WebServlet(name = "registrazione", urlPatterns = { "/registrazione" })

public class AggiungiUtente extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("messaggio", "Utente già esistente");
		req.getRequestDispatcher("home.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			GestioneDatabase gestioneDB = new GestioneDatabase(
					(EntityManagerFactory) getServletContext().getAttribute("emf"));
			Utente utente = new Utente();

			utente.setNome(req.getParameter("nome"));
			utente.setCognome(req.getParameter("cognome"));
			utente.setEta(req.getParameter("eta"));

			if (gestioneDB.controlloUtente(utente)) {
				req.setAttribute("messaggio", "Utente già esistente");
				req.getRequestDispatcher("home.jsp").forward(req, resp);
			} else {
				gestioneDB.aggiungiUtente(utente);
				req.getRequestDispatcher("Tabella.jsp").forward(req, resp);
			}
		} catch (IOException | ServletException  e) {
			e.printStackTrace();
		}
	}

}