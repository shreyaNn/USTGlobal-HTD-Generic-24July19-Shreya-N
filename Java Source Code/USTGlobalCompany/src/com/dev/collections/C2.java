package com.dev.collections;

import java.util.HashMap;

import com.dev.encapsulation.Dog;

public class C2 {
public static void main(String args[]) {


	HashMap<String,Dog> hm = new HashMap<String,Dog>();
	Dog d = new Dog();
	d.setAge(1);
	d.setBreed("DM");
	d.setColor("Black");
	
	Dog d1 = new Dog();
	d1.setAge(2);
	d1.setName("Ronnie");
	d1.setColor("Black and white");
	
	
	hm.put("1", d);
	hm.put("2",d1);
	System.out.println(hm);
	
	Dog f = hm.remove("2");
	System.out.println(f);
	System.out.println(hm);
	System.out.println("output of containskey() :"+hm.containsKey("3"));
	System.out.println("Output of containsValue() "+hm.containsValue(d1));
	
}
	
}
