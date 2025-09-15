package tic_tac_toe.strategy.winningStrategy;

import tic_tac_toe.models.Move;

public interface WinningStrategy {

   boolean checkWinner(Move move, int n );
}
