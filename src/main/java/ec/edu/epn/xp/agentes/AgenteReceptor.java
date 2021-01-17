package ec.edu.epn.xp.agentes;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.UnreadableException;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AgenteReceptor extends Agent {
    @Override
    protected void setup() {
        System.out.println(getName());
        super.setup();
        addBehaviour(new Comportamiento());
    }
    @Override
    protected  void takeDown(){
        super.takeDown();
        System.out.println("Finaliza proceso de Agente Receptor");
    }
    class Comportamiento extends CyclicBehaviour {

        @Override
        public void action() {

            try {
                ACLMessage acl = blockingReceive();
                double temperatura=datoQuemadoTemperatura();
                System.out.println("Su temperatura es: "+ temperatura);
                boolean usoMascarilla=datoQuemado();
                if(usoMascarilla){
                    System.out.println("Está puesto mascarilla");
                }else{
                    System.out.println("NO está puesto mascarilla");
                }

                if(acl.getConversationId()=="COD001" && usoMascarilla==true && temperatura<37) {
                    Imagen instanciaImagen = (Imagen) acl.getContentObject();
                    System.out.println(" PUEDE PASAR --> Recibí la Imagen: " + instanciaImagen.getEtiqueta() + " " + instanciaImagen.getFuente());
                }else{
                    System.out.println(" Entonces NO puede PASAR");
                }
            } catch (UnreadableException ex) {
                Logger.getLogger(AgenteReceptor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public boolean datoQuemado(){
        Random rd = new Random(); // creating Random object
        return rd.nextBoolean();
    }

    public double datoQuemadoTemperatura(){
        Random rd = new Random(); // creating Random object
        return 34 + (40-34)*rd.nextDouble();
    }
}
