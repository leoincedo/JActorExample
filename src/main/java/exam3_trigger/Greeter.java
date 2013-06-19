package exam3_trigger;

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

    private RP rp;

    public void greet( RP rp ) throws Exception {
        this.rp = rp;
    }

    public void trigger( RP rp ) throws Exception {
        rp.processResponse( null );
        this.rp.processResponse( "Hellow World" );
    }
}
