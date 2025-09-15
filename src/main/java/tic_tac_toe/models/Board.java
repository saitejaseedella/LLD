package tic_tac_toe.models;

import tic_tac_toe.enums.CellState;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Board {

    private int dimension;
    private List<List<Cell>> board;

    Board(int dimension){
        this.dimension = dimension;
        this.board = new ArrayList<>();

        //Creation of Board
        for(int i =0; i<dimension; i++){
            this.board.add(new ArrayList<>());
            for(int j = 0; j<dimension ;j++){
                this.board.get(i).add(new Cell(i,j));
            }
        }
    }

    void print(){
        for(List<Cell> cells : board){
            for (Cell cell : cells){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    System.out.print("|   |");
                }else {
                    System.out.println("| "+ cell.getPlayer().getSymbol().getSymbolChar() + "  |");
                }
            }
            System.out.println();
        }
    }
}
