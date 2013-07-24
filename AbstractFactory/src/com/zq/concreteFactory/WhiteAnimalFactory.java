package com.zq.concreteFactory;

import com.zq.abstractfactory.IAnimalFactory;
import com.zq.abstractfactory.ICat;
import com.zq.abstractfactory.IDog;

public class WhiteAnimalFactory implements IAnimalFactory {

	@Override
	public ICat createCat() {
		// TODO Auto-generated method stub
		return new WhiteCat();
	}

	@Override
	public IDog createDog() {
		// TODO Auto-generated method stub
		return new WhiteDog();
	}

}
