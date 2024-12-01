package com.zaid.generic.caller;

import java.util.Arrays;
import java.util.List;

public class WildcardUSe {
	
//=====================without using the wildcard=============================
//	public static void printList(List<Object> listInteger){
//		for (Object object : listInteger) {
//			System.out.println(object);
//		}
//		
//	}

	
//======================with using the wild card==================================
	
	public static void printList(List<?> listInteger){
		for (Object object : listInteger) {
			System.out.println(object);
		}
		
	}
	public static void main(String[] args) {
		List<Integer> listInteger2=Arrays.asList(10,45);
		WildcardUSe.printList(listInteger2);
	}

}
