package exam5_dependency_injection;

import org.agilewiki.jactor.Actor;
import org.agilewiki.jactor.RP;
import org.agilewiki.jactor.lpc.JLPCActor;
import org.agilewiki.jactor.lpc.Request;

/**
 * Created with IntelliJ IDEA.
 * User: liongo
 * Date: 13. 6. 18
 * Time: 오후 5:01
 * To change this template use File | Settings | File Templates.
 */
public class Greet extends Request<String, Greeter> {

    public static final Greet req = new Greet();


    @Override
    public boolean isTargetType(Actor actor) {
        return actor instanceof Greeter;
    }

    @Override
    public void processRequest(JLPCActor jlpcActor, RP rp) throws Exception {
        Greeter a = (Greeter)jlpcActor;
        a.greet( rp );
    }
}
