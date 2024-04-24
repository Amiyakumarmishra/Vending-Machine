package com.vendingmachine.model;

import java.util.HashMap;
import java.util.Map;

public class ItemInventory {
	
	private Map<Integer,Item> itemShelfs;
	
	public ItemInventory(){
		itemShelfs = new HashMap<>();
		itemShelfs.put(101, new Item(ItemType.COKE,20));
		itemShelfs.put(102, new Item(ItemType.COKE,20));
		itemShelfs.put(103, new Item(ItemType.PEPSI,15));
		itemShelfs.put(104, new Item(ItemType.PEPSI,15));
		itemShelfs.put(105, new Item(ItemType.JUICE,25));
		itemShelfs.put(106, new Item(ItemType.JUICE,25));
		itemShelfs.put(107, new Item(ItemType.SODA,10));
		itemShelfs.put(108, new Item(ItemType.SODA,10));
	}

	public Map<Integer, Item> getItemShelfs() {
		return itemShelfs;
	}

	public void setItemShelfs(Map<Integer, Item> itemShelfs) {
		this.itemShelfs = itemShelfs;
	}
	
	
}
