package tic_tac_toe.factory;

import tic_tac_toe.enums.BotDifficultyLevel;
import tic_tac_toe.strategy.botStrategy.BotPlayingStrategy;
import tic_tac_toe.strategy.botStrategy.EasyBotStrategy;
import tic_tac_toe.strategy.botStrategy.HardBotStrategy;
import tic_tac_toe.strategy.botStrategy.MediumBotStrategy;

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
