package com.vendingmachine;

import com.vendingmachine.model.Coin;
import com.vendingmachine.state.State;
import com.vendingmachine.state.VendingMachine;

public class VendingMachineApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendingMachine vendingMachine = new VendingMachine();
		try {
			State state = vendingMachine.getState();
			System.out.println(state.getClass());
			state.pressCoinInsertButton(vendingMachine);

			
			state = vendingMachine.getState();
			System.out.println(state.getClass());
			state.insertCoin(vendingMachine, Coin.FIVE);
			state.insertCoin(vendingMachine, Coin.FIVE);
//			state.insertCoin(vendingMachine, Coin.TEN);
			state.insertCoin(vendingMachine, Coin.TEN);
			
			System.out.println(vendingMachine.getCoinsList());
			
			state.pressSelectProductButton(vendingMachine);

			
			state = vendingMachine.getState();
			System.out.println(state.getClass());
			
			state.selectProduct(vendingMachine, 102);
			System.out.println(state.getClass());
			
			state = vendingMachine.getState();
			state.dispense(vendingMachine, 102);
			
			System.out.println(state.getClass());
			System.out.println(vendingMachine.getCoinsList());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
