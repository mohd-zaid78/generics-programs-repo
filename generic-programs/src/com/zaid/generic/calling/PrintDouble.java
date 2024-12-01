package com.zaid.generic.calling;

import lombok.AllArgsConstructor;


public class PrintDouble {
	private Double value;
	
	public PrintDouble(Double value){
		this.value=value;
	}
	
	public void printDouble(){
		System.out.println(value);
	}
}
