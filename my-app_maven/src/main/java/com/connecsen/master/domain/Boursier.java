package com.connecsen.master.domain;

public class Boursier extends Etudiant {
	
	private String priseEnCharge;
	
	public String getPriseEnCharge() {
		return priseEnCharge;
	}


	public void setPriseEnCharge(String priseEnCharge) {
		this.priseEnCharge = priseEnCharge;
	}


	public Boursier(int id, String nom, String prenom,String tel,Classe classe, String priseEnCharge) {
		super(id, nom, prenom,tel,classe);
		this.priseEnCharge = priseEnCharge;
	}


	public Boursier() {
		
	}


	@Override
	public double getCout() {
		// TODO Auto-generated method stub
		return 1000000;
	}

	
	

}
