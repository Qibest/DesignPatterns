package com.zq.concreteFactory;

import com.zq.abstractfactory.IAnimalFactory;
import com.zq.abstractfactory.ICat;
import com.zq.abstractfactory.IDog;

public class BlackAnimalFactory implements IAnimalFactory {

	@Override
	public ICat createCat() {
		// TODO Auto-generated method stub
		return new BlackCat();
	}

	@Override
	public IDog createDog() {
		// TODO Auto-generated method stub
		return new BlackDog();
	}

}
