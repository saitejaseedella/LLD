package com.lld.tic_tac_toe.models;

import lombok.Data;

@Data
public class Move {

    private Player player;
    private Cell cell;

     public Move(Player player, Cell cell){
         this.player=player;
         this.cell=cell;
     }


}
