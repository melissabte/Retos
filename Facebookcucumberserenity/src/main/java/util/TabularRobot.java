package util;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class TabularRobot {
	
	
	public void tab() throws InterruptedException, AWTException{
        try {
               System.out.println("estamos adentro del tabu");
               Robot bot = new Robot();
               Thread.sleep(6000);
       bot.keyPress(KeyEvent.VK_ESCAPE);
       bot.keyRelease(KeyEvent.VK_ESCAPE);
       Thread.sleep(6000);
       bot.keyPress(KeyEvent.VK_ESCAPE);
       bot.keyRelease(KeyEvent.VK_ESCAPE);
       Thread.sleep(6000);
       System.out.println("estamos adentro del tabu2");
                
        }catch( AWTException e) {
               e.printStackTrace();
               System.out.println("estamos adentro del tabu3");
        } 
        
  }

}



