package assigment2.A3;

import assigment2.A_intro.Queue;



/**
 * Use the synchronized keyword and signals.
 * 
 * You cannot decide whose's turn it is based on 
 * a 2 states variables, so know use a variable which
 * allows for more values (you need 3 states, that is, 3 turns).
 * 
 * Output should be: writer prints, both readers read, and so on...
 *
 */
 
class Signalled_2Readers_Queue implements Queue{
	int n=0;
	volatile boolean  ReadersTurn=false;
        volatile int control=0;
        
        
	@Override
	synchronized public void read(int ID) {
            
            int reader=ID;
            
            
           while(ReadersTurn==false){
               try {
                   wait();
               } catch (InterruptedException ex) {
                   
                
               }
           }
           
               
        
            
        if(reader == 0 && control== 0){
            System.out.println(n+"  read by reader ID= "+ID);
            control = 1;
            
            
        }
        if(reader == 1 && control == 1){
            System.out.println(n+"  read by reader ID= "+ID);  
            control = 0;
            notifyAll();
            ReadersTurn=false;
            
            
            
        }
           

             

            
		
		
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
            
            notifyAll();
            ReadersTurn=true;
                
            
            
            
	}

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




	
	
	
}




