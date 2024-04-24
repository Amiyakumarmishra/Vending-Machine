package com.vendingmachine.model;

public enum Coin {
	
	FIVE(5),
	TEN(10),
	TWO(2),
	TWENTY(20);
	
	int value;
	
	Coin(int value){
		this.value=value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
