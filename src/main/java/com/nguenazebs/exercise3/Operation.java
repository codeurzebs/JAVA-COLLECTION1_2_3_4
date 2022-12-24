package com.nguenazebs.exercise3;

public class Operation {

	private Nombre nombre;

	
	public Operation(Nombre nombre) {
		this.nombre = nombre;
	}

	public Nombre getNombre() {
		return nombre;
	}

	public void setNombre(Nombre nombre) {
		this.nombre = nombre;
	}
	public int division()throws OperationException {
		if((this.nombre.getVar1()/this.nombre.getVar2())==0) {
			throw new OperationException();
		}else {
			return this.nombre.getVar1()/this.nombre.getVar2();
		}
		
	}
	public int racineDeLaSomme() throws OperationException{
		int racine=(int)Math.sqrt(this.nombre.getVar1()+this.nombre.getVar2());
		if(racine<=0) {
			throw new OperationException();
		}else {
			return racine;
		}
	}
	
	
}
