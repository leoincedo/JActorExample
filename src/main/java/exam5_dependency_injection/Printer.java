package exam5_dependency_injection;

import org.agilewiki.jactor.RP;
import org.agilewiki.jactor.lpc.JLPCActor;

/**
 * Created with IntelliJ IDEA.
 * User: liongo
 * Date: 13. 6. 19
 * Time: 오전 10:09
 * To change this template use File | Settings | File Templates.
 */
public class Printer extends JLPCActor {
    public void print( String value, RP rp ) throws Exception {
        System.out.println( "Printer:print : " + value );
        rp.processResponse( null );
    }
}
