package com.zq.concretebuilder;

import com.zq.builder.PersonBuilder;
import com.zq.product.Man;
import com.zq.product.Person;

public class ManBuilder implements PersonBuilder {
	Person person;
	
	public ManBuilder(){
		person = new Man();
	}
	@Override
	public void buildHead() {
		// TODO Auto-generated method stub
		person.setHead("�������˵�ͷ");
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		person.setBody("�������˵�����");
	}

	@Override
	public void buildFoot() {
		// TODO Auto-generated method stub
		person.setFoot("�������˵Ľ�");
	}

	@Override
	public Person buildPerson() {
		// TODO Auto-generated method stub
		return person;
	}

}
