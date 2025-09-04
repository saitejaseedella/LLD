package vending_machine.models;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Inventory {
    private List<ItemShelf> itemShelves;
}
