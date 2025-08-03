package com.lld.tic_tac_toe.strategy.winningStrategy;

import com.lld.tic_tac_toe.models.Board;
import com.lld.tic_tac_toe.models.Move;
import com.lld.tic_tac_toe.models.Player;

public interface WinningStrategy {

   boolean checkWinner(Move move, int n );
}
