package com.zaid.generic.caller;

import com.zaid.generic.calling.PrintDouble;
import com.zaid.generic.calling.PrintInteger;
import com.zaid.generic.calling.PrintString;

public class Print {

	public static void main(String[] args) {
		
//==========================with out using the generic=============================
		PrintInteger i = new PrintInteger(10);
		i.printInteger();
		
		PrintDouble d = new PrintDouble(20.33);
		d.printDouble();
		
		PrintString s = new PrintString("string");
		s.printString();
		
		
//==========================with using the generic=====================================
		
		PrintGeneric<Integer> generic=new PrintGeneric<Integer>(10);
		generic.print();
		
		PrintGeneric<Double> generic2=new PrintGeneric<Double>(44.55);
		generic2.print();
		
		PrintGeneric<String> generic3=new PrintGeneric<String>("zaid");
		generic3.print();

	}

}
