package com.connecsen.master.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.connecsen.master.domain.Etudiant;
@Component
@Qualifier
public class ClasseServiceImp implements IClasseService {

	@Override
	public double SommeScollarite(List<Etudiant> etudiants) {
		// TODO Auto-generated method stub
		double somme = 0;
		for (Etudiant etudiant : etudiants) {
			somme +=etudiant.getCout();
		}
		return somme;
	}

	
}
