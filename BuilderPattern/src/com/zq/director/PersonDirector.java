package com.zq.director;

import com.zq.builder.PersonBuilder;
import com.zq.product.Person;

public class PersonDirector {
	public Person constructPerson(PersonBuilder pb){
		pb.buildHead();
		pb.buildBody();
		pb.buildFoot();
		return pb.buildPerson();
	}
}
