package exam4_parallel;

import org.agilewiki.jactor.RP;
import org.agilewiki.jactor.lpc.JLPCActor;

/**
 * Created with IntelliJ IDEA.
 * User: liongo
 * Date: 13. 6. 19
 * Time: 오전 9:52
 * To change this template use File | Settings | File Templates.
 */
public class Timer extends JLPCActor {

    public void delay( int ms, RP rp ) throws Exception {
        Thread.sleep( ms );
        rp.processResponse( null );
    }
}
