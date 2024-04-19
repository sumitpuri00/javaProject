package com.sumit.himani;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sumit.himani.game.GameConfiguration;

public class RunGameUsingSpring {
	
	AnnotationConfigApplicationContext Context=new AnnotationConfigApplicationContext(GameConfiguration.class);
	
	
	
}
