package com.zq.builder;

import com.zq.product.Person;

public interface PersonBuilder {
	void buildHead();
	void buildBody();
	void buildFoot();
	Person buildPerson();
}
