package com.lld.tic_tac_toe.models;

import com.lld.tic_tac_toe.enums.BotDifficultyLevel;
import com.lld.tic_tac_toe.enums.PlayerType;
import com.lld.tic_tac_toe.strategy.botStrategy.BotPlayingStrategy;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Bot extends Player{

    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(String name, Symbol symbol,BotDifficultyLevel botDifficultyLevel) {
        super(name, symbol, PlayerType.BOT);
        this.botDifficultyLevel=botDifficultyLevel;
    }

    public Move makeMove(){
//        this.botPlayingStrategy.makeMove();
        return null;
    }
}
