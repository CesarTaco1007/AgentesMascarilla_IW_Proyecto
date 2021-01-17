package ec.edu.epn.xp.agentes;

import org.junit.Test;

import static org.junit.Assert.*;

public class EnviarMensajeTest {

    @Test
    public void given_two_agents_when_messageSend_then_ok() {
        EnviarMensaje em = new EnviarMensaje();
        assertEquals(1, em.messageSend());
    }

    @Test
    public void given_two_agents_when_messageFailure_then_ok() {
        EnviarMensaje em = new EnviarMensaje();
        assertEquals(0, em.messageFailure());
    }

    @Test
    public void given_two_agents_when_messageTempOK_then_ok(){
        EnviarMensaje em = new EnviarMensaje();
        assertEquals(1, em.messageTempOK());
    }

    @Test
    public void given_two_agents_when_messageTempF_then_ok(){
        EnviarMensaje em = new EnviarMensaje();
        assertEquals(0, em.messageTempF());
    }

}