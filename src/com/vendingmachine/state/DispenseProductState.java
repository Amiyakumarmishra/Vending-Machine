package com.vendingmachine.state;

import java.util.ArrayList;

import com.vendingmachine.model.Coin;

public class DispenseProductState implements State {
	DispenseProductState(VendingMachine machine,int productCode){
		System.out.println("Here is your Product");
		try {
			dispense(machine,productCode);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void pressCoinInsertButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception();
	}

	@Override
	public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception();
	}

	@Override
	public void pressSelectProductButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception();
	}

	@Override
	public void selectProduct(VendingMachine machine, int productCode) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception();
	}

	@Override
	public int refund(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception();
	}

	@Override
	public int getChange(VendingMachine machine, int remainingAmount) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception();
	}

	@Override
	public void dispense(VendingMachine machine,int productCode) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Recieve your product -"+machine.getItemInventory().getItemShelfs().get(productCode).getItemType());
		machine.setState(new IdealState());
		machine.setCoinsList(new ArrayList<>());
//		throw new Exception();
	}

}
