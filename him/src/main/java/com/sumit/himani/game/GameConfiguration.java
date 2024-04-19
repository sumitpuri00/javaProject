package com.sumit.himani.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {
	
	@Bean
	public GamingConsole game() {
		var GamingConsoleObj=new MarioGame();
		
		return GamingConsoleObj;
	}
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		GameRunner gameRunnerObj=new GameRunner(game);
		return gameRunnerObj;
	}
	
}
