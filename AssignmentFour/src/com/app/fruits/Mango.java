package com.app.fruits;

public class Mango extends Fruit{	
	
	public Mango()
	{
		this.name = "Mango";
	}
	
	


public Mango(String name, String colour,double weight,boolean isFresh) {
		super(name,colour,weight, isFresh);
		
	}

@Override
public String toString() {
	return "Fruit name=" + name + ", colour=" + colour + ", weight=" + weight;
}

	@Override
	public String taste(){
		return "Sweet";
	}

}
