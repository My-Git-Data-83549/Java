package com.app.fruits;

public class Apple extends Fruit {
	public Apple()
	{
		this.name = "Apple";
	}
	
	public Apple(String name, String colour,double weight,boolean isFresh) {
		super(name,colour,weight, isFresh);
		
	}
	@Override
	public String toString() {
		return "Fruit name=" + name + ", colour=" + colour + ", weight=" + weight;
	}
    
	public String taste() {
		return "Sweet n Sour";
	}
}
