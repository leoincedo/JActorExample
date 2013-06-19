package exam8_statemachine;


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
        SMBuilder smb = new SMBuilder();
        smb._send( printer, new Print( "a" ));
        smb._send( printer, new Print( "b" ));
        smb._send( printer, new Print( "c" ));
        smb.call( rp );
    }
}