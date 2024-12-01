package com.zaid.generic.caller;

import com.zaid.generic.calling.Animal;
import com.zaid.generic.calling.Cat;
import com.zaid.generic.calling.Dog;
import com.zaid.generic.calling.MySpecificGeneric;

public class TestMySpecific {

	public static void main(String[] args) {
		MySpecificGeneric<Animal> specific=new MySpecificGeneric<Animal>(new Cat("cat "));
		specific.behave();

	}

}
