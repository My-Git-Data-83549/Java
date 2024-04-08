package com.app.fruits;

public class Orange extends Fruit {
	
	public Orange()
	{
		this.name = "Orange";
	}
	
	public Orange(String name, String colour,double weight,boolean isFresh) {
		super(name,colour,weight, isFresh);
		
	}
	
	@Override
	public String toString() {
		return "Fruit name=" + name + ", colour=" + colour + ", weight=" + weight;
	}
	
	@Override
	public String taste() {
		return "Sour";
	}
}
