package com.zensar;

class Order {

    private Item item;
    private String title;

    public Order() {
// TODO Auto-generated constructor stub
	System.out.println("Inside Order default Constructor..");
    }

    public Order(Item item, String title) {
	super();
	this.item = item;
	this.title = title;
	System.out.println("Inside Order Parameterized Constructor..");
    }

    public void initialize() {
	System.out.println("Inside Initialize()");
    }

    public void destory() {
	System.out.println("Inside destory()");
    }

    public Item getItem() {
	return item;
    }

    public void setItem(Item item) {
	this.item = item;
	System.out.println("Inside SetItem()");
    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    @Override
    public String toString() {
	return "Order [item=" + item + ", title=" + title + "]";
    }

}