package com.vendingmachine.state;

import com.vendingmachine.model.Coin;

public class SelectProductState implements State{

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
	public void selectProduct(VendingMachine machine,int productCode) throws Exception {
		// TODO Auto-generated method stub
		int amountPaidByUser =0;

		
		for(Coin coin:machine.getCoinsList()) {
			amountPaidByUser = amountPaidByUser + coin.getValue();
		}
		
		int productPrice = machine.getItemInventory().getItemShelfs().get(productCode).getPrice();
		System.out.println("amount paid by user :"+ amountPaidByUser);
		System.out.println("Product code :"+productPrice);
		
		if(amountPaidByUser < productPrice) {
			machine.setState(new IdealState());
			throw new Exception("Insufficoent amount Paid");
		}else {
			if(amountPaidByUser > productPrice) {
				getChange(machine,amountPaidByUser-productPrice);
			}
			machine.setState(new DispenseProductState(machine,productCode));
		}
	}

	@Override
	public int refund(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception();
	}

	@Override
	public int getChange(VendingMachine machine,int remainingAmount) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Recieve The Change "+remainingAmount);
//		throw new Exception();
		return remainingAmount;
	}

	@Override
	public void dispense(VendingMachine machine,int productCode) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception();
	}

}
