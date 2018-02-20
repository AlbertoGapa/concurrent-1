package concurrent_1.C;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Modify class concurrent_assignment1.B.TPrintID so that it is created implementing Runnable 
 * (call the new class R_PrintID). 
 * And now the loop sleeps the thread a random time between 0 and 1.
 * 
 * @author yournamehere
 *
 */

public class R_PrintID extends Thread implements Runnable {
    
    Thread h=Thread.currentThread();
        int ID;
    public R_PrintID(){
        ID=0;
    }
    public R_PrintID(int x){
        ID=x;
    }
    
    @Override
    public void run() {
        for(int i=0; i<10;i++){
            System.out.println(this.ID);
            long x= (long) Math.random();
            try {
                h.sleep( x);
            } catch (InterruptedException ex) {
                Logger.getLogger(R_PrintID.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
