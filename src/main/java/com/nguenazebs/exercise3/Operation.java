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
	
}
