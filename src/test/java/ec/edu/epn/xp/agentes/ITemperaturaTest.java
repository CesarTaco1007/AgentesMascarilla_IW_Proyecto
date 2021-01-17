package ec.edu.epn.xp.agentes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ITemperaturaTest {

    @Test
    public void given_two_agents_when_tempOK_then_ok() {
        ITemperatura t = Mockito.mock(ITemperatura.class);
        Mockito.when(t.tempOK()).thenReturn(1);
        assertEquals(1, t.tempOK());
    }

    @Test
    public void given_two_agents_when_tempF_then_ok() {
        ITemperatura t = Mockito.mock(ITemperatura.class);
        Mockito.when(t.tempF()).thenReturn(0);
        assertEquals(0, t.tempOK());
    }

}