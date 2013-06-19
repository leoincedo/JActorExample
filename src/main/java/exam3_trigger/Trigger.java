package exam3_trigger;

import org.agilewiki.jactor.Actor;
import org.agilewiki.jactor.RP;
import org.agilewiki.jactor.lpc.JLPCActor;
import org.agilewiki.jactor.lpc.Request;

/**
 * Created with IntelliJ IDEA.
 * User: liongo
 * Date: 13. 6. 18
 * Time: 오후 6:38
 * To change this template use File | Settings | File Templates.
 */
public class Trigger extends Request< Object, Greeter > {
    public static final Trigger req = new Trigger();

    @Override
    public boolean isTargetType(Actor actor) {
        return actor instanceof Greeter;
    }

    @Override
    public void processRequest(JLPCActor jlpcActor, RP rp) throws Exception {
        Greeter a = (Greeter)jlpcActor;
        a.trigger( rp );
    }
}
