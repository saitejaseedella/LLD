package vending_machine.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemShelf {
    private boolean soldOut;
    private Item item;
}
