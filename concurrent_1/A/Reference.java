package concurrent_1.A;

/**
 * Get the reference of the main thread */

public class Reference {

    Thread h=Thread.currentThread();
    
    
    public void OddPrint() throws InterruptedException{
        
    int j=0;
   
    
    for(int i=0; j<50;i++){
        
        
        if(i%2!=0){
            j++;
            
            
            
            h.setName("MyMainConcurrent");
            
            System.out.println("Number "+i+" "+ h.getName());
            }
        h.sleep(2000);
        }
    }
   
}

