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
/* @DEV JAVA ZEBS       
 * Page site
 * 24/12/2022
 * @author          NGUENA ZEBS HAUPUR FAUST
 * @uri 	    pilotezebs.com
 * @copyright       Copyright (c) 2022 NGUENA ZEBS HAUPUR FAUST
 * @license         My Login is licensed under the ECLIPSE license.
 * @github          https://github.com/NGUENAZEBS
 * @version         1.0.1 USJ
 * Help me to keep this project
 *https://ko-fi.com/pilotezebs
 */
