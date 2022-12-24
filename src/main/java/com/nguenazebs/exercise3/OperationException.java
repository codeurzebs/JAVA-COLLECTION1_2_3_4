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
