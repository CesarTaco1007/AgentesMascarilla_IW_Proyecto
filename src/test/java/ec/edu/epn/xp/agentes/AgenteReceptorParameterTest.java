package ec.edu.epn.xp.agentes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class AgenteReceptorParameterTest {
        private boolean a, expected;

        @Parameterized.Parameters
        //1
        public static Iterable<Object[]> parameters() {
            List<Object[]> objects = new ArrayList<Object[]>();
            objects.add(new Object[]{true,false});
            objects.add(new Object[]{false,true});
            objects.add(new Object[]{true,true});
            objects.add(new Object[]{false,false});
            return objects;
        }

        public AgenteReceptorParameterTest(boolean a, boolean expected) {
            this.a = a;
            this.expected = expected;
        }

        @Test
        public void given_parameters_when_datoQuemado_then_ok() {
            AgenteReceptor ar = new AgenteReceptor();
            boolean expected = ar.datoQuemado();
            assertTrue(expected);
        }

        //2
        @Test
        public void given_parameters_when_datoQuemadoTemperatura_then_ok() {

        }

}