package com.zaid.generic.calling;

import com.sun.istack.internal.logging.Logger;

public class Animal {
	
	private String name;

	public Animal(String name) {
		this.name = name;
	}
	
	public void eat(){
		//System.out.println(name+"is eating");
		Logger logger=Logger.getLogger(Animal.class);
		logger.info(name+"is eating");
	}
	
	

}
