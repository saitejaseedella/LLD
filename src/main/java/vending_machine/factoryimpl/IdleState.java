package vending_machine.factoryimpl;

import vending_machine.State;
import vending_machine.models.Coins;
import vending_machine.models.Item;
import vending_machine.models.MachineState;
import vending_machine.models.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {

    public IdleState(){System.out.println("Currently machine is in ideal state");}

    public IdleState(VendingMachine vendingMachine){
        System.out.println("Currently machine is in ideal state");
        vendingMachine.setCoins(new ArrayList<>());
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
    vendingMachine.setVendingMachineState(MachineState.HAS_MONEY);
    }


    @Override
    public void clickOnStartProcessSelectionButton(VendingMachine vendingMachine) {
        System.out.println("Your can't use this feature in here");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine,Coins coins) {
        System.out.println("Your can't use this feature in here");

    }

    @Override
    public int getChange(int returnCheMoney) {
        return 0;
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) {
        System.out.println("Your can't use this feature in here");
        return null;
    }

    @Override
    public List<Coins> refundFullMoney(VendingMachine vendingMachine) {
        return List.of();
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) {

    }
}
