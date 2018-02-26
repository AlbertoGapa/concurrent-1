package concurrent_1.C;



/**
 * Create class Numbers which instantiates 5 R_PrintID objects (with ID 1 to 5) and runs them.
 * 
 * 
 * @author yournamehere
 *
 */

public class Numbers   {
    public Numbers() throws InterruptedException{
        Thread a =new Thread(new R_PrintID(1));
        a.start();
        Thread b =new Thread(new R_PrintID(2));
        b.start();
        Thread c =new Thread(new R_PrintID(3));
        c.start();
        Thread d =new Thread(new R_PrintID(4));
        d.start();
        Thread e =new Thread(new R_PrintID(5));
        e.start();
    }
}
