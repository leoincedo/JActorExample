package exam6_exception_handling;

import org.agilewiki.jactor.Actor;
import org.agilewiki.jactor.RP;
import org.agilewiki.jactor.lpc.JLPCActor;
import org.agilewiki.jactor.lpc.Request;

/**
 * Created with IntelliJ IDEA.
 * User: liongo
 * Date: 13. 6. 19
 * Time: 오전 10:53
 * To change this template use File | Settings | File Templates.
 */
public class ThrowException extends Request<Object, ThrowsException> {

    public static final ThrowException req = new ThrowException();

    @Override
    public boolean isTargetType(Actor actor) {
        return actor instanceof ThrowsException;
    }

    @Override
    public void processRequest(JLPCActor jlpcActor, RP rp) throws Exception {
        ThrowsException a = (ThrowsException)jlpcActor;
        a.throwException( rp );

    }
}