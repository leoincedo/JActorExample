package exam5_dependency_injection;

import org.agilewiki.jactor.RP;
import org.agilewiki.jactor.lpc.JLPCActor;

/**
 * Created with IntelliJ IDEA.
 * User: liongo
 * Date: 13. 6. 18
 * Time: 오후 4:39
 * To change this template use File | Settings | File Templates.
 */
public class JATest extends JLPCActor {

    public void start( final RP rp ) throws Exception  {

        Printer printer = new Printer();
        printer.initialize( getMailbox() );

        final Greeter greeter = new Greeter();
        greeter.initialize( getMailbox(), printer );

        ( new Print("Greeting:")).send( this, greeter, new RP<Object>() {
            @Override
            public void processResponse(Object o) throws Exception {
                Greet.req.send( JATest.this, greeter, rp );

            }
        });

    }
}