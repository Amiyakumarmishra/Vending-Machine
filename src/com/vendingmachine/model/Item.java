package com.vendingmachine.model;

public class Item {
	
	ItemType itemType;
	Integer price;
	Item(ItemType itemType,Integer price){
		this.itemType=itemType;
		this.price=price;
	}
	public ItemType getItemType() {
		return itemType;
	}
	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
}
