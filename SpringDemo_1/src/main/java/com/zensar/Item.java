package com.zensar;

public class Item {
    private String name;
    private double price;
    
    
    public Item() {
	// TODO Auto-generated constructor stub
	System.out.println("called default");
    }
    public Item(String name, double price) {
	super();
	this.name = name;
	this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
	return "Item [name=" + name + ", price=" + price + "]";
    }
    
    
}
