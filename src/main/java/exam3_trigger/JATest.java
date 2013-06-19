package exam3_trigger;

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
        Greeter greeter = new Greeter();
        greeter.initialize( getMailbox() );
        Greet.req.send( this, greeter, new RP<String>() {
            @Override
            public void processResponse( String greeting ) throws Exception {
                System.out.println("exam3_trigger.JATest::start::proecessResponse");
                System.out.println( greeting );
                rp.processResponse( null );
            }
        }
        );

        System.out.println("exam3_trigger.....");
        Trigger.req.sendEvent(this, greeter);

    }
}