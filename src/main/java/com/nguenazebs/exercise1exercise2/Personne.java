package com.nguenazebs.exercise1exercise2;

public class Personne {

	private int num;
	private String nom;
	private String prenom;
	
	
	
	public Personne() {
	}
	
	public Personne(int num, String nom, String prenom) {
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
	
	public String getNomPrenom() {
		return this.nom+this.prenom;
	}

	
}
