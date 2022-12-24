package com.nguenazebs.exercise3;

import java.util.Scanner;

public class TestNombre {

	public static void main(String[] args) {

		String reponse="o";
		while(reponse.equals("o")||reponse.equals("O")) {
		Scanner lire=new Scanner(System.in);
		System.out.println("Entrer 2 entiers:");
		int x1=lire.nextInt();
		int x2=lire.nextInt();
		Nombre nombre=new Nombre(x1, x2);
		System.out.println("faite un choix:\n 1-)Division \n 2-)Racine Carrée\n");
		int choixString=lire.nextInt();
		Operation operation=new Operation(nombre);
		if(choixString==1) {
			try {
				System.out.println("LE RESULTAT DE LA DIVISION EST= "+operation.division());
			} catch (OperationException e) {
				e.traitementDivision(operation);
			}
		}
		if(choixString==2) {
			try {
				System.out.println("LE RESULTAT DE LA RACINE CARRE EST= "+operation.racineDeLaSomme());
			} catch (OperationException u) {
				u.traitementRacineCarre(operation);
			}
		}
		System.out.println("Voulez-vous recommencer??\n si oui taper O sinon taper N:");
		reponse=lire.next();
		if(reponse.equals("n")||reponse.equals("N")) {
				try {
					System.out.println(operation.division()+" "+operation.racineDeLaSomme());
				} catch (OperationException e) {
					System.out.println("OUUPPSSS ERRROORRR voici le pile: ");
					e.printStackTrace();
				}
			}
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
