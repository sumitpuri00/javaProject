package com.sumit.himani;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sumit.himani.game.GameConfiguration;
import com.sumit.himani.game.GameRunner;
import com.sumit.himani.game.GamingConsole;
import com.sumit.himani.game.MarioGame;
import com.sumit.himani.game.PackManGame;
import com.sumit.himani.game.SpringConfiguration;
import com.sumit.himani.game.SuperContraGame;

public class AppGamingBasicJava {
	
	
	public static void main(String[] args) {
		
		
//		now we are creating spring context by using a class called
//		AnnotationConfigApplicationContex;
		try(var context=new AnnotationConfigApplicationContext(SpringConfiguration.class)){

//			System.out.print("this is spring bean ");
//			System.out.println(context.getBean("name"));	
//			
//			System.out.println(context.getBean("person"));
//			System.out.println(context.getBean("address"));
////			
//			System.out.println(context.getBean("person2"));
//			
//			System.out.println(context.getBean("space"));
//			System.out.println(context.getBean("she"));		
			
//			System.out.println(context.getBean("firstStoic"));		
			

		}catch(ArithmeticException e)  
        {  
			
			
            System.out.println("this is just an temp array");
            
            
            
        }		
		
		
		

		AnnotationConfigApplicationContext contextt=new AnnotationConfigApplicationContext(GameConfiguration.class);
		GamingConsole sheConsole = (GamingConsole) contextt.getBean("game");
		sheConsole.up();
		
		contextt.getBean(GamingConsole.class).down();
		System.out.println(contextt.getBean(GamingConsole.class));
		System.out.println(contextt.getBean("game"));
		
		
		

//		 System.out.print("this is himani");
		 
////		 var Game=new MarioGame();
////		 var Game=new SuperContraGame();
//		     var Game =new PackManGame();
//		 	 var gameRunner =new GameRunner(Game);
//	
//		 gameRunner.run();
		
		
		 

	}

}
