package exam6_exception_handling;

import org.agilewiki.jactor.RP;
import org.agilewiki.jactor.lpc.JLPCActor;

/**
 * Created with IntelliJ IDEA.
 * User: liongo
 * Date: 13. 6. 19
 * Time: 오전 10:52
 * To change this template use File | Settings | File Templates.
 */
public class ThrowsException extends JLPCActor {
    public void throwException( RP rp ) throws Exception {
        throw new Exception("Boo!!!");
        //rp.processResponse( null );
    }
}
