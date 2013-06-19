package exam7_loop;

import org.agilewiki.jactor.JAIterator;
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

        final Printer printer = new Printer();
        printer.initialize( getMailbox() );
        final int max = 5;

        (new JAIterator() {
            int i = 0;
            @Override
            protected void process(RP rp) throws Exception {
                if( i == max ) rp.processResponse("done");
                else {
                    i += 1;
                    ( new Print(""+i) ).send( JATest.this, printer, rp );
                }

            }
        }).iterate( rp );



    }
}