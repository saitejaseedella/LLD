package com.lld.tic_tac_toe.strategy.winningStrategy;

import com.lld.tic_tac_toe.models.Move;
import com.lld.tic_tac_toe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinning implements WinningStrategy{

    private Map<Symbol,Integer> leftHashmaps = new HashMap<>();

    private Map<Symbol,Integer> rightHashmaps = new HashMap<>();

    @Override
    public boolean checkWinner(Move move, int n) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        if(row == col){
            leftHashmaps.put(symbol,leftHashmaps.getOrDefault(symbol,0)+1);
            if(leftHashmaps.get(symbol) == n){
                return true;
            }
        }

        if(row + col == n-1){
            rightHashmaps.put(symbol, rightHashmaps.getOrDefault(symbol,0)+1);
            if(rightHashmaps.get(symbol) == n){
                return true;
            }
        }
        return false;

    }
}
