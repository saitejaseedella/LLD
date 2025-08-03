package com.lld.tic_tac_toe.models;

import com.lld.tic_tac_toe.enums.PlayerType;
import lombok.Data;

import java.util.Scanner;

@Data
public class Player {
    private Symbol symbol;
    private String name;
    private PlayerType playerType;
    private Scanner scanner = new Scanner(System.in);

    public Player(String name, Symbol symbol, PlayerType playerType){
        this.name=name;
        this.symbol=symbol;
        this.playerType=playerType;
    }

    public Cell chooseCellToPlay(){
        //take row num
        System.out.println("Enter the row number where you want to play?");
        int row = scanner.nextInt();

        //take col num
        System.out.println("Enter the column number where you want to play?");
        int col = scanner.nextInt();

        //inform back the cell
        return new Cell(row,col);

    }
    private Player(){}

}
