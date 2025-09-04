package vending_machine.factoryimpl;

import vending_machine.State;
import vending_machine.models.Coins;
import vending_machine.models.Item;
import vending_machine.models.MachineState;
import vending_machine.models.VendingMachine;

import java.util.List;

public class HasMoneyState implements State {
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You can't use this feature in this sate"+vendingMachine.getVendingMachineState());
    }

    @Override
    public void clickOnStartProcessSelectionButton(VendingMachine vendingMachine) throws Exception {
            vendingMachine.setVendingMachineState(MachineState.SELECTION);
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine,Coins coins) {
        System.out.println("Added Money");
        vendingMachine.getCoins().add(coins);
    }

    @Override
    public int getChange(int returnCheMoney) throws Exception {
        throw new Exception("You can't use this feature in this sate");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("You can't use this feature in this sate"+vendingMachine.getVendingMachineState());

    }

    @Override
    public List<Coins> refundFullMoney(VendingMachine vendingMachine) {
        System.out.println("Money has been retuned");
        vendingMachine.setVendingMachineState(MachineState.IDEAL);
        return vendingMachine.getCoins();
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception {
        throw new Exception("You can't use this feature in this sate"+vendingMachine.getVendingMachineState());

    }
}
