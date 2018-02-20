package concurrent_1.B;

/**
 * Create class Numbers which instantiates 5 T_PrintID objects (with ID 1 to 5) and runs them.
 * Can you detect some problem? Can you explain the reason?
 * 
 * @author yournamehere
 *
 */

public class Numbers {

    public Numbers(){
        T_PrintID a = new T_PrintID(1);
        a.run();
        T_PrintID b = new T_PrintID(2);
        b.run();
        T_PrintID c = new T_PrintID(3);
        c.run();
        T_PrintID d = new T_PrintID(4);
        d.run();
        T_PrintID e = new T_PrintID(5);
        e.run();
    }
}
