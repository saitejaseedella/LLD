package com.lld.tic_tac_toe.factory;

import com.lld.tic_tac_toe.enums.BotDifficultyLevel;
import com.lld.tic_tac_toe.strategy.botStrategy.BotPlayingStrategy;
import com.lld.tic_tac_toe.strategy.botStrategy.EasyBotStrategy;
import com.lld.tic_tac_toe.strategy.botStrategy.HardBotStrategy;
import com.lld.tic_tac_toe.strategy.botStrategy.MediumBotStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel){

       return switch (botDifficultyLevel)
        {
            case EASY -> new EasyBotStrategy();
            case HARD -> new HardBotStrategy();
            default -> new MediumBotStrategy();
        };
    }
}
