package exam2_actor2actor;

import org.agilewiki.jactor.RP;
import org.agilewiki.jactor.lpc.JLPCActor;

/**
 * Created with IntelliJ IDEA.
 * User: liongo
 * Date: 13. 6. 18
 * Time: 오후 4:59
 * To change this template use File | Settings | File Templates.
 */
public class Greeter extends JLPCActor  {

    public void greet( RP rp ) throws Exception {
        rp.processResponse("Hello world!!");
    }
}
