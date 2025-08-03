package com.lld.tic_tac_toe;

import com.lld.tic_tac_toe.controller.GameController;
import com.lld.tic_tac_toe.enums.GameStatus;
import com.lld.tic_tac_toe.enums.PlayerType;
import com.lld.tic_tac_toe.exceptions.PlayerCountNotValidException;
import com.lld.tic_tac_toe.models.Game;
import com.lld.tic_tac_toe.models.Player;
import com.lld.tic_tac_toe.models.Symbol;
import com.lld.tic_tac_toe.strategy.winningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) throws PlayerCountNotValidException {
        List<Player> players = new ArrayList<>();
        Player p1 = new Player("sai",new Symbol('a',"abc"), PlayerType.HUMAN);
        Player p2 = new Player("sai1",new Symbol('x',"ab"), PlayerType.HUMAN);
        players.add(p1);
        players.add(p2);
        List<WinningStrategy> winningStrategies = new ArrayList<>();

        GameController gameController = new GameController();

        Game game = gameController.startGame(3,players,winningStrategies);

        while(game.getGameStatus().equals(GameStatus.IN_PROGRESS)){
            gameController.printBoard(game);
            gameController.makeMove(game);
        }
    }
}
