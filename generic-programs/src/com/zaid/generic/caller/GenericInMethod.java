package com.zaid.generic.caller;

public class GenericInMethod {

	public <T>void genericType(T t){
		System.out.println(t);
		
	}
	
	public static void main(String[] args) {
		GenericInMethod method = new GenericInMethod();
		method.genericType("zaid");
		method.genericType(13);

	}

}
