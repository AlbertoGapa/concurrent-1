package concurrent_1.C;



/**
 * Create class Numbers which instantiates 5 R_PrintID objects (with ID 1 to 5) and runs them.
 * 
 * 
 * @author yournamehere
 *
 */

public class Numbers {
    public Numbers() throws InterruptedException{
        R_PrintID a = new R_PrintID(1);
        a.run();
        R_PrintID b = new R_PrintID(2);
        b.run();
        R_PrintID c = new R_PrintID(3);
        c.run();
        R_PrintID d = new R_PrintID(4);
        d.run();
        R_PrintID e = new R_PrintID(5);
        e.run();
    }
}
