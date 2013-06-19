package exam1_helloworld;

import org.agilewiki.jactor.RP;
import org.agilewiki.jactor.lpc.JLPCActor;

/**
 * Created with IntelliJ IDEA.
 * User: liongo
 * Date: 13. 6. 18
 * Time: 오후 4:39
 * To change this template use File | Settings | File Templates.
 */
public class JATest extends JLPCActor {
    public void start( final RP rp ) throws Exception  {
        System.out.println("exam1_helloworld : Hello World");
        rp.processResponse(null);
    }
}