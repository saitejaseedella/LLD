package com.lld.tic_tac_toe.models;

import com.lld.tic_tac_toe.enums.CellState;
import lombok.Data;

@Data
public class Cell {
    private int row;
    private int col;
    private Player player;
    private CellState cellState;

    public Cell(int row, int col){
        this.row=row;
        this.col=col;
        this.cellState=CellState.EMPTY;

    }
}
