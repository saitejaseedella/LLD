package vending_machine.factoryimpl;

import vending_machine.State;
import vending_machine.models.Coins;
import vending_machine.models.Item;
import vending_machine.models.VendingMachine;

import java.util.List;

public class SelectionState implements State {
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {

    }

    @Override
    public void clickOnStartProcessSelectionButton(VendingMachine vendingMachine) {

    }

    @Override
    public void insertCoin(VendingMachine vendingMachine,Coins coins) {

    }

    @Override
    public int getChange(int returnCheMoney) {
        return 0;
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) {
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
