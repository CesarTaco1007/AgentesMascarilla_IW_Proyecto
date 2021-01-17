package ec.edu.epn.xp.agentes;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class AgenteEmisor extends Agent{

    @Override
    protected void setup() {
        System.out.println(getName());
        super.setup();
        addBehaviour(new Comportamiento());
    }

    @Override
    protected  void takeDown(){
        super.takeDown();
        System.out.println("Finaliza proceso de Agente Emisor");
    }
    class Comportamiento extends CyclicBehaviour{
        @Override
        public void action(){
            new EnviarMensaje().enviarMensajeObject(ACLMessage.INFORM,
                    "AgenteReceptor",
                    getAgent(),
                    new Imagen(" Con mascarilla",
                            "E:\\andre\\Pictures\\Saved Pictures\\thumb-1920-593278.jpg"),
                    "COD001");
            doWait(10000);
            new EnviarMensaje().enviarMensajeObject(ACLMessage.INFORM,
                    "AgenteReceptor",
                    getAgent(),
                    new Imagen(" Con mascarilla",
                            "E:\\andre\\Pictures\\Saved Pictures\\thumb-1920-593278.jpg"),
                    "COD001");
            doDelete();
        }
    }
}
