package com.connecsen.master.domain;

public abstract  class Etudiant {
	
	private int id;
	private String nom;
	private String prenom;
	private String tel;
	private Classe classe;
	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public Classe getClasse() {
		return classe;
	}


	public void setClasse(Classe classe) {
		this.classe = classe;
	}


	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Etudiant(int id, String nom, String prenom,String tel, Classe classe) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.tel=tel;
		this.classe = classe;
	}
	
	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", TEL="+tel+"]";
	}

	public abstract double getCout(); 
	

}
