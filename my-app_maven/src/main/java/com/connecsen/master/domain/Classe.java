package com.connecsen.master.domain;

//import java.util.Date;

public class Classe {
	private Long Id;
	private String nom;
	private String annee;
	public Classe(Long id, String nom, String annee) {
		super();
		Id = id;
		this.nom = nom;
		this.annee = annee;
	}
	public Classe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAnnee() {
		return annee;
	}
	public void setAnnee(String annee) {
		this.annee = annee;
	}
	
	

}
