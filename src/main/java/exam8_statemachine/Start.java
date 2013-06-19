package exam8_statemachine;

import org.agilewiki.jactor.Actor;
import org.agilewiki.jactor.RP;
import org.agilewiki.jactor.lpc.JLPCActor;
import org.agilewiki.jactor.lpc.Request;

/**
 * Created with IntelliJ IDEA.
 * User: liongo
 * Date: 13. 6. 18
 * Time: 오후 4:41
 * To change this template use File | Settings | File Templates.
 */
public class Start extends Request< Object, JATest> {
    public static final Start req = new Start();

    @Override
    public boolean isTargetType(Actor actor) {
        return actor instanceof exam1_helloworld.JATest;
    }

    @Override
    public void processRequest(JLPCActor jlpcActor, RP rp) throws Exception {
        JATest a = (JATest)jlpcActor;
        a.start( rp );
    }
}
