package com.connecsen.master.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.connecsen.master.domain.Boursier;
import com.connecsen.master.domain.Classe;
import com.connecsen.master.domain.Etudiant;
import com.connecsen.master.domain.NonBousier;

@Component
@Qualifier
public class EtudiantServiceImp implements IEtudiantService {

	@Override
	public Etudiant creerEtudiantt(boolean priseEnCharge) {
		// TODO Auto-generated method stub
		Classe MPSI=new Classe((long) 1,"sa","10-10-2018");
		Classe ISI=new Classe((long) 1,"sfr","10-10-2020");
		if(priseEnCharge) {
			return new Boursier(1, "fall", "pape","772526325",MPSI, "encharge");
		}
		return new NonBousier(2, "koita", "gaoussu","7725265525",ISI, 140000);
	}

	@Override
	public void afficherNomComplet(Etudiant e) {
		System.out.println("Nom: "+e.getNom()+ " "+e.getPrenom());
	}

	@Override
	public double CalculScolarite(Etudiant e) {
		// TODO Auto-generated method stub
		return e.getCout();
	}
	

	


	
}
