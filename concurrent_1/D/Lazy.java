package concurrent_1.D;

import java.util.logging.Level;
import java.util.logging.Logger;

/** Lazy must:
 * - Extend Thread
 * - Enter in a loop which iterates a random number of times between 2 to 8.
 * - Sleep 1 second
 * - At each iteration, it displays a random message among: “I am dressing up…”, “Just a sec, please…”, or “These clothes do not suit me…”.
 * - If Hurry interrupts Lazy before it is finished, Lazy claims: “That’s not cricket, please play the game!”.
 * - If Lazy finishes before being interrupted, it says “I am ready, the early bird catches the worm!”.
 * 
 * @author yournamehere
 *
 */

public class Lazy extends Thread {
    int i;
    
public Lazy(){
    i=0;
}
public Lazy(int a){
    i=a;
}
    @Override
    public void run(){
        
        Thread h= Thread.currentThread();
        int x = (int) (Math.floor(Math.random()*(8-2))+2);
        
        
        

        while(i<x && ! h.isInterrupted()){
        
            
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                h.interrupt();
                break;
            }
               
                
                    
                i++;
                int y = (int) (Math.floor(Math.random()*(3-1))+1);
                
                switch(y){
                    case 1: System.out.println("I am dressing up…");
                    break;
                    
                    case 2: System.out.println("“Just a sec, please…");
                    break;
                    
                    case 3: System.out.println("These clothes do not suit me…");
                    break;
                }
            
            
            
            
            
            
            
        }
        
        if(x<=i)
            System.out.println("I am ready, the early bird catches the worm!");
    
  
        if(h.isInterrupted())        
                System.out.println("That’s not cricket, please play the game!”");
                
                
            }

}

