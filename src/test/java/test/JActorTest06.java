package test;

import exam6_exception_handling.JATest;
import exam6_exception_handling.Start;
import org.agilewiki.jactor.JAFuture;
import org.agilewiki.jactor.JAMailboxFactory;
import org.agilewiki.jactor.Mailbox;
import org.agilewiki.jactor.MailboxFactory;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: liongo
 * Date: 13. 6. 18
 * Time: 오후 4:28
 * To change this template use File | Settings | File Templates.
 */



public class JActorTest06 {

    @Test
    public void jactorGettingStarted() throws Exception
    {
        System.out.println("1. start test exam06");

        MailboxFactory mailboxFactory = JAMailboxFactory.newMailboxFactory( 10 );
        Mailbox mailbox = mailboxFactory.createMailbox();

        JAFuture future = new JAFuture();

        JATest test = new JATest();
        test.initialize( mailbox );

        Start.req.send( future, test );

        System.out.println("2. end of test");

        mailboxFactory.close();
        System.out.println("3. the end");

    }


}
