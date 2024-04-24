package com.vendingmachine.state;

import com.vendingmachine.model.Coin;

public interface State {
	
	void pressCoinInsertButton(VendingMachine machine) throws Exception;
	
	void insertCoin(VendingMachine machine,Coin coin) throws Exception;
	
	void pressSelectProductButton(VendingMachine machine) throws Exception;
	
	void selectProduct(VendingMachine machine,int productCode) throws Exception;
	
	int refund(VendingMachine machine) throws Exception;
	
	int getChange(VendingMachine machine,int remainingAmount) throws Exception;
	
	void dispense(VendingMachine machine,int productCode) throws Exception;
}
