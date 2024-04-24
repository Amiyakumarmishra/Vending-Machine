package com.vendingmachine.state;

import com.vendingmachine.model.Coin;

public class IdealState implements State{

	@Override
	public void pressCoinInsertButton(VendingMachine machine) {
		// TODO Auto-generated method stub
		machine.setState(new HasMoneyState());
		
	}

	@Override
	public void insertCoin(VendingMachine machine,Coin coin) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception();
	}

	@Override
	public void selectProduct(VendingMachine machine,int productCode) throws Exception{
		// TODO Auto-generated method stub
		throw new Exception();
	}

	@Override
	public int refund(VendingMachine machine) throws Exception{
		// TODO Auto-generated method stub
		throw new Exception();
	}

	@Override
	public int getChange(VendingMachine machine,int remainingAmount) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception();
	}

	@Override
	public void dispense(VendingMachine machine,int productCode) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception();
	}

	@Override
	public void pressSelectProductButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception();
	}

}
