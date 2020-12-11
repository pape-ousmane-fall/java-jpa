package com.connecsen.master.domain;

public class NonBousier extends Etudiant {
	
	private double frais;
	

	


	public NonBousier() {
		super();
		// TODO Auto-generated constructor stub
	}


	public NonBousier(int id, String nom, String prenom,String tel, Classe classe,double frais) {
		super(id, nom, prenom,tel, classe);
		// TODO Auto-generated constructor stub
	}



	@Override
	public double getCout() {
		// TODO Auto-generated method stub
		return frais;
	}


	@Override
	public String toString() {
		return super.toString() + "  [frais=" + frais + "]";
	}


	public double getFrais() {
		return frais;
	}


	public void setFrais(double frais) {
		this.frais = frais;
	}

	
	

}
