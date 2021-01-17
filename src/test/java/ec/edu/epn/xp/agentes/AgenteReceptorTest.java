package ec.edu.epn.xp.agentes;

import org.junit.Test;

import static org.junit.Assert.*;

public class AgenteReceptorTest {

    @Test
    public void given_true_when_datoQuemado_then_ok() {//true = using mask
        AgenteReceptor ar = new AgenteReceptor();
        assertTrue(ar.datoQuemado());
    }

    @Test
    public void given_false_when_datoQuemado_then_false(){//false = not using mask
        AgenteReceptor ar = new AgenteReceptor();
        assertFalse(ar.datoQuemadoF());
    }

    @Test
    public void given_not_equal_when_datoQuemadoTempOK_then_ok(){
        AgenteReceptor ar = new AgenteReceptor();
        assertNotEquals(37, ar.datoQuemadoTemperatura());
    }

    @Test
    public void given_notNULL_when_datoquemadoTempOK_then_ok(){
        AgenteReceptor ar = new AgenteReceptor();
        assertNotNull(ar.datoQuemadoTemperatura());
    }
}