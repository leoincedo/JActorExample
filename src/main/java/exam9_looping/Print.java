package exam9_looping;

import org.agilewiki.jactor.Actor;
import org.agilewiki.jactor.RP;
import org.agilewiki.jactor.lpc.JLPCActor;
import org.agilewiki.jactor.lpc.Request;

/**
 * Created with IntelliJ IDEA.
 * User: liongo
 * Date: 13. 6. 19
 * Time: 오전 10:10
 * To change this template use File | Settings | File Templates.
 */
public class Print extends Request< Object, Printer> {
    public final String value;

    public Print( String value ) {
        this.value = value;
    }

    @Override
    public boolean isTargetType(Actor actor) {
        return actor instanceof Printer;
    }

    @Override
    public void processRequest(JLPCActor jlpcActor, RP rp) throws Exception {
        Printer a = (Printer) jlpcActor;
        a.print(value, rp);
    }
}
