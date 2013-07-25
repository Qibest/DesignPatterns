package com.zq.test;

import com.zq.concretebuilder.ManBuilder;
import com.zq.director.PersonDirector;
import com.zq.product.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDirector pd = new PersonDirector();
		Person person = pd.constructPerson(new ManBuilder());
		System.out.println(person.getHead());
		System.out.println(person.getBody());
		System.out.println(person.getFoot());
	}

}
