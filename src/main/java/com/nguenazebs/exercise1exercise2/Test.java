package com.nguenazebs.exercise1exercise2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		String reponse="o";
		while(reponse.equals("o")||reponse.equals("O")) {
			Personne personne1=new Personne(12,"Monsieur","Github");
			Personne personne2=new Personne(22,"Madame","JAVA");
			Personne personne3=new Personne(52,"Fils","C++");
			
			Map<String, Personne>personnes=new HashMap<>();
			personnes.put(personne1.getNomPrenom(), personne1);
			personnes.put(personne2.getNomPrenom(), personne2);
			personnes.put(personne3.getNomPrenom(), personne3);
			
			for(Entry<String, Personne>entry:personnes.entrySet()) {
				System.out.println(entry.getKey()+" "+entry.getValue().getNum());
			}
			
			ListePersonnes etudiantListePersonnes=new ListePersonnes();
			Scanner lire=new Scanner(System.in);
			int num=-1;
			while(num<=0) {
				
					System.out.println("Entrer un numero Positif:");
					num=lire.nextInt();
				
			}
			System.out.println("Quel est votre Nom:");
			String nom=lire.next();
			System.out.println("Quel est votre Prenom:");
			String prenom=lire.next();
			Personne personne=new Personne(num,nom,prenom);
			ListePersonnes nouvellePersonne=new ListePersonnes(personnes);
			try {
				nouvellePersonne.ajouterPersonne(personne);
			} catch (PersonneException e) {
				System.out.println("Erreur dans la Pile cette utilisateur existe deja. Pile d'erreur:\n");
				System.out.println(e.getMessage());
			}
			finally {
				System.out.println("Voulez-vous recommencer??\n si oui taper O sinon taper N:");
				reponse=lire.next();
				if(reponse.equals("n")||reponse.equals("N")) {
					nouvellePersonne.affichePersonne();
				}
			}
		}
		
		
		

	}

}
