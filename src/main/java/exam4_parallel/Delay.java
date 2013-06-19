package exam4_parallel;

import org.agilewiki.jactor.Actor;
import org.agilewiki.jactor.RP;
import org.agilewiki.jactor.lpc.JLPCActor;
import org.agilewiki.jactor.lpc.Request;

/**
 * Created with IntelliJ IDEA.
 * User: liongo
 * Date: 13. 6. 19
 * Time: 오전 9:55
 * To change this template use File | Settings | File Templates.
 */
public class Delay extends Request< Object, Timer > {

    public final int ms;

    public Delay( int ms ) {
        this.ms = ms;
    }


    @Override
    public boolean isTargetType(Actor actor) {
        return actor instanceof  Timer;
    }

    @Override
    public void processRequest(JLPCActor jlpcActor, RP rp) throws Exception {
        Timer timer = (Timer)jlpcActor;
        timer.delay( ms, rp );
    }
}
