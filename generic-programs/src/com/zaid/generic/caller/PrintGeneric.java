package com.zaid.generic.caller;

public class PrintGeneric<T>{
	private T value;
	
	public PrintGeneric(T value){
		this.value=value;
	}
	
	public void print(){
		System.out.println(value);
	}

}
