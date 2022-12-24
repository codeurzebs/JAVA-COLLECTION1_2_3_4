package com.nguenazebs.exercise1exercise2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ListePersonnes {

	Map<String, Personne>personnes=new HashMap<>();
	
	
	
	public ListePersonnes() {
		
	}

	

	public ListePersonnes(Map<String, Personne> personnes) {
		this.personnes = personnes;
	}



	public Map<String, Personne> getPersonnes() {
		return personnes;
	}



	public void setPersonnes(Map<String, Personne> personnes) {
		this.personnes = personnes;
	}



	public void ajouterPersonne(Personne personne)throws PersonneException {
		if(this.personnes.containsValue(personne.getNomPrenom())) {
			throw new PersonneException();
		}else {
			this.personnes.put(personne.getNomPrenom(), personne);
		}
	}
	public void affichePersonne() {
		Set s=this.personnes.entrySet();
		for(Entry entry: this.personnes.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	
}
