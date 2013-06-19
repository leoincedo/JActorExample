package exam4_parallel;

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
        Timer timer1 = new Timer();
        timer1.initialize( getMailboxFactory().createAsyncMailbox() );

        Timer timer2 = new Timer();

        timer2.initialize( getMailboxFactory().createAsyncMailbox() );

        final long t0 = System.currentTimeMillis();

        RP prp = new RP() {
            boolean pending = true;

            @Override
            public void processResponse(Object o) throws Exception {
                if( pending ) pending = false;
                else {
                    System.out.println( System.currentTimeMillis() - t0 );
                    rp.processResponse( null );
                }
            }
        };

        (new Delay(1000)).send( this, timer1, prp );
        (new Delay(1000)).send( this, timer2, prp );


    }
}