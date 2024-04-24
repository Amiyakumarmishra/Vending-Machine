package com.vendingmachine.state;

import java.util.ArrayList;
import java.util.List;

import com.vendingmachine.model.Coin;
import com.vendingmachine.model.ItemInventory;

public class VendingMachine {
	
	private State state;
	private List<Coin> coinsList;
	private ItemInventory itemInventory;
	public VendingMachine(){
		this.itemInventory = new ItemInventory();
		this.state = new IdealState();
		this.coinsList = new ArrayList<>();
	}

	public List<Coin> getCoinsList() {
		return coinsList;
	}

	public ItemInventory getItemInventory() {
		return itemInventory;
	}

	public void setItemInventory(ItemInventory itemInventory) {
		this.itemInventory = itemInventory;
	}

	public void setCoinsList(List<Coin> coinsList) {
		this.coinsList = coinsList;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
}
