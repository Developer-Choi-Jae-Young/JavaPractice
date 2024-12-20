package com.kh.practice.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {

	public static void main(String[] args) {
		Set<Person> hSet2 = new HashSet<>();
		
		hSet2.add(new Person("허완", 34, 165));
		hSet2.add(new Person("양민욱", 31, 170));
		hSet2.add(new Person("안창원", 31, 180));
		hSet2.add(new Person("허완", 34, 165));
		
		System.out.println(hSet2);
		
		System.out.println("=".repeat(50));
		
		for(Person p : hSet2) {
			System.out.println(p);
		}
		
		System.out.println("=".repeat(50));
		
		Iterator<Person> it = hSet2.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p);
		}
	}

}
