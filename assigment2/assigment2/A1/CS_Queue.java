package assigment2.A1;

import assigment2.A_intro.Queue;
import static java.lang.Thread.currentThread;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Use condition synchronization by means of busy wait.
 *
 * What kind of variable do you need to implement busy wait synchronization?
 *
 * Set a meaningful name for such variable.
 *
 */
class CS_Queue implements Queue {

    int n = 0;
   volatile boolean  ReadersTurn=false;
    
    
    @Override
    public void read() {
        
        while(ReadersTurn==false);
        
        
        System.out.println(n);
        
        ReadersTurn=false;
        
        
        

    }

    @Override
    public void write(int x) {
         
        
        while(ReadersTurn);
        
        
        
        n = x;
        ReadersTurn=true;
        

        

    }

    @Override
    public void read(int ID) {
        // no need to implement this

    }
    
    
        
        
        
        
        
    }


