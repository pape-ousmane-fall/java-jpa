package com.connecsen.master.presentation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.connecsen.master.domain.Boursier;
import com.connecsen.master.domain.Etudiant;
import com.connecsen.master.domain.NonBousier;
import com.connecsen.master.service.ClasseServiceImp;
import com.connecsen.master.service.EtudiantServiceImp;
import com.connecsen.master.service.IClasseService;
import com.connecsen.master.service.IEtudiantService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 charegement du fichier
		ApplicationContext appContext=(ApplicationContext) new ClassPathXmlApplicationContext("beans.xml");
		
		Etudiant etu1=(Boursier) appContext.getBean("etudiant-boursier");
		Etudiant etu2=(NonBousier) appContext.getBean("etudiant-non-boursier");
		EtudiantServiceImp serviceEtudiant=(EtudiantServiceImp) appContext.getBean("service-etudiant");
		ClasseServiceImp serviceClasse= (ClasseServiceImp) appContext.getBean("service-classe");
		
		System.out.println("etudiant boursier : "+etu1.toString());
		System.out.println("etudiant non boursier: "+etu2.toString());
		
		//Etudiant et=null;
        //double total=1000;
        //et=serviceEtudiant.creerEtudiantt(false);
        //serviceEtudiant.afficherNomComplet(et);
        System.out.println("scolarite: "+serviceEtudiant.CalculScolarite(etu1));
		

		
		//List<Etudiant> etudiants = new ArrayList<Etudiant>();
		//etudiants.add(nonBEtudiant);
		//etudiants.add(boursier);
		//System.out.println(serviceClasse.SommeScollarite(etudiants));
	}

}
