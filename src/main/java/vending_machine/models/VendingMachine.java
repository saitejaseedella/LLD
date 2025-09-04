package vending_machine.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendingMachine {

    private List<Coins> coins;
    private ItemShelf itemShelf;
    private MachineState vendingMachineState;
}
