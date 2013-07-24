package com.zq.test;

import com.zq.abstractfactory.IAnimalFactory;
import com.zq.concreteFactory.BlackAnimalFactory;
import com.zq.concreteFactory.WhiteAnimalFactory;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IAnimalFactory blackAnimalFactory = new BlackAnimalFactory();
		blackAnimalFactory.createCat().eat();
		blackAnimalFactory.createDog().eat();
		
		IAnimalFactory whiteAnimalFactory = new WhiteAnimalFactory();
		whiteAnimalFactory.createCat().eat();
		whiteAnimalFactory.createDog().eat();
	}

}
