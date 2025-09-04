package vending_machine;

import vending_machine.models.Coins;
import vending_machine.models.Item;
import vending_machine.models.VendingMachine;

import java.util.List;

public interface State {

    void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception;
    void clickOnStartProcessSelectionButton(VendingMachine vendingMachine) throws Exception;
    void insertCoin(VendingMachine vendingMachine ,Coins coins) throws Exception;
    int getChange(int returnCheMoney) throws Exception;
    Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception;
    List<Coins> refundFullMoney(VendingMachine vendingMachine) throws Exception;
    void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception;
}
