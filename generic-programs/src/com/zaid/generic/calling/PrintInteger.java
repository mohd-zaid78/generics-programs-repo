package com.zaid.generic.calling;

import lombok.AllArgsConstructor;


public class PrintInteger {
	private int value;
	
	public PrintInteger(int value){
		this.value=value;
	}
	
	public void printInteger(){
		System.out.println(value);
	}
}
