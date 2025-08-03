package com.lld.tic_tac_toe.strategy.winningStrategy;

import com.lld.tic_tac_toe.models.Move;
import com.lld.tic_tac_toe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColWinning implements WinningStrategy{

    private Map<Integer, Map<Symbol,Integer>> colHashmaps = new HashMap<>();

    @Override
    public boolean checkWinner(Move move, int n) {

        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();
        //update the count
        if(!colHashmaps.containsKey(col)){
            colHashmaps.put(col,new HashMap<>());
        }
        Map<Symbol,Integer> mp = colHashmaps.get(col);

        mp.put(symbol,mp.getOrDefault(symbol,0)+1);
        int count = mp.get(symbol);
        if(count == n){
            return true;
        }
        return false;


    }
}
