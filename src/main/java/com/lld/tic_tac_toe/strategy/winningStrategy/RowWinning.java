package com.lld.tic_tac_toe.strategy.winningStrategy;

import com.lld.tic_tac_toe.models.Move;
import com.lld.tic_tac_toe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinning implements WinningStrategy{

   private Map<Integer, Map<Symbol,Integer>> rowHashmaps = new HashMap<>();

    @Override
    public boolean checkWinner(Move move, int n) {

        int row = move.getCell().getRow();
        Symbol symbol = move.getPlayer().getSymbol();
        //update the count
        if(!rowHashmaps.containsKey(row)){
            rowHashmaps.put(row,new HashMap<>());
        }
        Map<Symbol,Integer> mp = rowHashmaps.get(row);

        mp.put(symbol,mp.getOrDefault(symbol,0)+1);
        int count = mp.get(symbol);
        if(count == n){
            return true;
        }
        return false;

    }
}
