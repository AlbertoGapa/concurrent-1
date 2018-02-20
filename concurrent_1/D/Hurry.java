package concurrent_1.D;
/**
 * Hurry must:
 * - Be the main thread
 * - Create the Lazy thread.
 * - Wait for Lazy to finish. Each second it must print the message: “Aren’t you ready yet?” and checks if Lazy is finished.
 * - If Lazy isn’t finished after 5 seconds, Hurry will claim “You are resting in your laurels… and I am leaving!” and interrupts Lazy. Then it waits for Lazy to finish.
 * - However, if Lazy finishes before the 5 seconds deadline, Hurry says “At last, a turtle runs rings round you!”.
 * 
 * @author yournamehere
 *
 */


public class Hurry extends Thread {
    
    public Hurry() throws InterruptedException{
    Thread h=Thread.currentThread();
    Lazy Tl = new Lazy();
    int i =0;
    
    while(Tl.isAlive() ==true){
    Tl.join(1000);
        System.out.println("Aren`t you ready yet");
        
        i++;
        if(5<=i){
            System.out.println("You are reting in your laurels... and I am leaving!");
            Tl.interrupt();
            Tl.join();
        }
        
        
    }
    
    if(i<5)
            System.out.println("At last, a turtle runs rings round you!");
    
    
    }
}
