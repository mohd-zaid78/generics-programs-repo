package com.zaid.generic.calling;

import lombok.AllArgsConstructor;


public class PrintString {
	private String value;
	
	public PrintString(String value){
		this.value=value;
	}
	
	public void printString(){
		System.out.println(value);
	}
}
