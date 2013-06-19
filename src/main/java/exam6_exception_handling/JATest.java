package exam6_exception_handling;

import exam5_dependency_injection.Greet;
import exam5_dependency_injection.Greeter;
import exam5_dependency_injection.Print;
import exam5_dependency_injection.Printer;
import org.agilewiki.jactor.ExceptionHandler;
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

        ThrowsException throwsException = new ThrowsException();

        throwsException.initialize( getMailbox() );
        setExceptionHandler( new ExceptionHandler() {
            @Override
            public void process(Exception e) throws Exception {
                System.out.println( e.getMessage() );
                rp.processResponse( null );
            }
        });

        ThrowException.req.send( this, throwsException, new RP() {

            @Override
            public void processResponse(Object o) throws Exception {
                System.out.println("No Exception!!!!");
                rp.processResponse( null );
            }
        });



    }
}