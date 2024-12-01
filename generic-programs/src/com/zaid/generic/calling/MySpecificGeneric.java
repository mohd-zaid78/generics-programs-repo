package com.zaid.generic.calling;

public class MySpecificGeneric<T extends Animal>{
     T animal;
     
     public MySpecificGeneric(T animal) {
		this.animal = animal;
	}

	public void behave(){
    	 animal.eat();
     }
}
