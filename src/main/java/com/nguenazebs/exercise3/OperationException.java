package com.nguenazebs.exercise3;

public class OperationException extends Exception{
	
	public void traitementDivision(Operation operation) {
		try {
			operation.division();
			
		} catch (OperationException e) {
			System.out.println("OUUPPSSS ERRROORRR voici le pile: ");
			e.printStackTrace();
		}
	}
	public void traitementRacineCarre(Operation operation) {
		try {
			operation.racineDeLaSomme();
		} catch (OperationException e) {
			System.out.println("OUUPPSSS ERRROORRR voici le pile: ");
			e.printStackTrace();
		}
	}
	private static final long serialVersionUID = 1L;

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
