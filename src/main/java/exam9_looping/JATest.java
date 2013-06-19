package exam9_looping;


import org.agilewiki.jactor.RP;
import org.agilewiki.jactor.lpc.JLPCActor;
import org.agilewiki.jactor.simpleMachine.BooleanFunc;
import org.agilewiki.jactor.simpleMachine.ObjectFunc;
import org.agilewiki.jactor.simpleMachine.SimpleMachine;

/**
 * Created with IntelliJ IDEA.
 * User: liongo
 * Date: 13. 6. 18
 * Time: 오후 4:39
 * To change this template use File | Settings | File Templates.
 */
public class JATest extends JLPCActor {
    int counter = 0;

    public void start( final RP rp ) throws Exception  {

        Printer printer = new Printer();
        printer.initialize( getMailbox() );
        SMBuilder smb = new SMBuilder();

        counter = 1;

        smb._label("loop");
        smb._send( printer, new ObjectFunc() {
            @Override
            public Object get(SimpleMachine simpleMachine) {
                return new Print(""+counter);
            }
        });

        smb._if( new BooleanFunc() {
            @Override
            public boolean get(SimpleMachine simpleMachine) {
                counter += 1;
                return counter < 6;
            }
        }, "loop" );

        smb.call( rp );

    }
}