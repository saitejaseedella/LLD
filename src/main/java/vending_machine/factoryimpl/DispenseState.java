package vending_machine.factoryimpl;

import vending_machine.State;
import vending_machine.models.Coins;
import vending_machine.models.Item;
import vending_machine.models.MachineState;
import vending_machine.models.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class DispenseState implements State {
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
        System.out.println("System is in ideal state");
        vendingMachine.setCoins(new ArrayList<>());
    }

    @Override
    public void clickOnStartProcessSelectionButton(VendingMachine vendingMachine) {
    vendingMachine.setVendingMachineState(MachineState.SELECTION);
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine ,Coins coins) throws Exception {
    throw new Exception("First select click on insert coin");
    }

    @Override
    public int getChange(int returnCheMoney) throws Exception {
        throw new Exception("You need to inset the coins");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("You need to inset the coins");
    }

    @Override
    public List<Coins> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You need to inset the coins");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception {
        throw new Exception("You need to inset the coins");
    }
}
