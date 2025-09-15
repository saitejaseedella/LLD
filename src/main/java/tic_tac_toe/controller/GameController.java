package tic_tac_toe.controller;

import tic_tac_toe.exceptions.PlayerCountNotValidException;
import tic_tac_toe.models.Game;
import tic_tac_toe.models.Player;
import tic_tac_toe.strategy.winningStrategy.WinningStrategy;

import java.util.List;

public class GameController {

    public Game startGame(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) throws PlayerCountNotValidException {
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies )
                .build();

    }

    public void makeMove(Game game){
        game.makeMove();

    }

    public void printBoard(Game game){
        game.printBoard();
    }


}
