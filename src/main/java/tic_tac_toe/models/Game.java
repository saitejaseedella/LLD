package tic_tac_toe.models;

import tic_tac_toe.enums.CellState;
import tic_tac_toe.enums.GameStatus;
import tic_tac_toe.exceptions.PlayerCountNotValidException;
import tic_tac_toe.strategy.winningStrategy.WinningStrategy;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Game {

    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private Player winner;
    private int nextPlayerTurnIndex;
    private GameStatus gameStatus;
    private List<WinningStrategy> winningStrategies;


    public static Builder  getBuilder(){
        return new Builder();
    }
   private Game(int dimension, List<Player> players,List<WinningStrategy> winningStrategies){
        this.board = new Board(dimension);
        this.players=players;
        this.moves=new ArrayList<>();
        this.winner=null;
        this.nextPlayerTurnIndex=0;
        this.gameStatus=GameStatus.IN_PROGRESS;
        this.winningStrategies = winningStrategies;
    }

    public boolean checkWinner(Move move){

        for(WinningStrategy winningStrategy:winningStrategies){
            if(winningStrategy.checkWinner(move,board.getDimension())){
                return true;
            }
        }
        return false;
    }
    public void makeMove(){
        //Who is the next player

        Player currentPlayer = players.get(nextPlayerTurnIndex);
        System.out.println("Hey it's "+ currentPlayer.getName() +"'s turn");

        //ask that player to make a move?
       Cell dummyCell = currentPlayer.chooseCellToPlay();
       int row = dummyCell.getRow();
       int col = dummyCell.getCol();
        if(!validateMove(dummyCell.getRow(),dummyCell.getCol())){
            System.out.println("It's a invalid move, can you choose again?");
            return;
        }

        // Executing move in the board
        Cell cell = board.getBoard().get(row).get(col);
        cell.setCellState(CellState.FILLED);
        cell.setPlayer(currentPlayer);
        Move move = new Move(currentPlayer,cell);
        moves.add(move);

        //Update player Index
        nextPlayerTurnIndex=(nextPlayerTurnIndex-1)% players.size();

        //check weather move is a winning move
        if(checkWinner(move)){
            gameStatus = GameStatus.ENDED;
            winner = currentPlayer;
            System.out.println("Hey Player "+ move.getPlayer().getName()+ "'s the winner");
        }else if (moves.size() == board.getDimension()* board.getDimension()){
            gameStatus = GameStatus.DRAW;
        }

    }

    private boolean validateMove(int row, int col){
        //Basic Boundary check
        if(row < 0 || col < 0 || row>=board.getDimension() || col>=board.getDimension()){
            return false;
        }

        //Check the board cell is emoty or not
        if(board.getBoard().get(row).get(col).getCellState().equals(CellState.FILLED)){
            return false;
        }
        return true;
    }

    public void printBoard(){
        board.print();
    }

    @Data
    public static class Builder{

        private int dimension;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }


        private void validate() throws PlayerCountNotValidException {
            validatePlayerCount();
        }
        private void validatePlayerCount() throws PlayerCountNotValidException {
            if(players.size() != dimension-1){
                throw new PlayerCountNotValidException("Player's count is valid");
            }
        }

       public Game build() throws PlayerCountNotValidException {
            //perform all the validation checks
            validate();

            return new Game(dimension, players,winningStrategies);
        }
    }

}
