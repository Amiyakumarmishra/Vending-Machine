package com.vendingmachine.state;

import com.vendingmachine.model.Coin;

public class HasMoneyState implements State{

	@Override
	public void pressCoinInsertButton(VendingMachine machine) throws Exception{
		// TODO Auto-generated method stub
		throw new Exception();
	}

	@Override
	public void insertCoin(VendingMachine machine,Coin coin) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("adding coin"+coin.getValue());
		machine.getCoinsList().add(coin);
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
	public int getChange(VendingMachine machine,int remainingAmount) throws Exception{
		// TODO Auto-generated method stub
		throw new Exception();
	}

	@Override
	public void dispense(VendingMachine machine,int productCode) throws Exception{
		// TODO Auto-generated method stub
	}
	@Override
	public void pressSelectProductButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		machine.setState(new SelectProductState());
	}

}
