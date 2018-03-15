package assigment2.A2;

import assigment2.A_intro.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Semaphore;


/**
 * Use the synchronized keyword and signals so that
 * you do not need to busy wait.
 * But of course you still need your variable to know
 * whose's turn it is.
 *
 */
 
class Signalled_Queue implements Queue{
	int n=0;
	volatile boolean  ReadersTurn=false;
	@Override
	synchronized public void read() {
            
           while(ReadersTurn==false){
               try {
                   wait();
               } catch (InterruptedException ex) {
                   
                
               }
               
               
        }
            System.out.println(n);
            ReadersTurn=false;
            notifyAll();
             

            
		
		
	}

	@Override
	synchronized public void write(int x) {
            
            while(ReadersTurn){
                try {
                    wait();
                } catch (InterruptedException ex) {
                    
                    
                }
            }
                
            
            
            n=x;
            ReadersTurn=true;
            notifyAll();
                
            
            
            
	}

	@Override
	public void read(int ID) {
		// no need to implement this
		
	}
	
	
}


