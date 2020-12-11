package com.connecsen.master.service;

import com.connecsen.master.domain.Etudiant;

public interface IEtudiantService {
	public Etudiant creerEtudiantt(boolean priseEnCharge );	

	public void afficherNomComplet(Etudiant e) ;

	 public double CalculScolarite (Etudiant e);
}