package com.mycompany.rishimaven;

public class Candies extends Sweets {

	Candies(String name, int weight, int cost) {
		super(name, weight, cost);
		// TODO Auto-generated constructor stub
	}

	@Override
	String getType() {
		// TODO Auto-generated method stub
		return "candy";
	}

}
