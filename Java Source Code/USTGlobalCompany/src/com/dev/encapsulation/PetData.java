package com.dev.encapsulation;

public class PetData {
	final static int i=10;

	public static void main(String[] args) {
//		i=20; final variables cannot be changeds
		Pet c1 = new Pet();
		Pet t = new  Pet();
//		Pet r = new Pet();
		c1.setName("Cat");
		c1.setAge(10);
		c1.setBreed("Persian Cat");
		c1.setLocality("Persia");
		c1.setColor("White");
		c1.setName("Cat");
		c1.setAge(20);
		c1.setBreed("American Curl");
		c1.setLocality("United states");
		c1.setColor("Black");
		
		t.setAge(20);
		t.setBreed("Siberian");
		t.setLocality("Siberia");
		t.setColor("Brown");
		Pet[] p = {c1};
		System.out.println("Cat");
		for(int i=0;i<p.length;i++) {
			System.out.println("Age is" +p[i].getAge());
			System.out.println("Breed is" +p[i].getBreed());
			System.out.println("Locality is" +p[i].getLocality());
			System.out.println("Color is" +p[i].getColor());
			System.out.println("**********");
		}

			Pet[] p1 = {t};
			System.out.println("Tiger");
			for(int i1=0;i1<p1.length;i1++) {
				System.out.println("Age is" +p[i1].getAge());
				System.out.println("Breed is" +p[i1].getBreed());
				System.out.println("Locality is" +p[i1].getLocality());
				System.out.println("Color is" +p[i1].getColor());
				System.out.println("**********");
			}
		
	}
}

		
		
		
		
		
	

