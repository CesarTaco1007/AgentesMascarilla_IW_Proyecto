package ec.edu.epn.xp.agentes;

import jade.core.AID;
import jade.core.Agent;
import jade.domain.FIPANames;
import jade.lang.acl.ACLMessage;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EnviarMensaje {

    public static void enviarMensajeObject(int tipoMsj, String receptor,
                                           Agent agenteEmisor, Serializable contenido, String conversationID) {
        ACLMessage acl = new ACLMessage(tipoMsj);
        AID id = new AID();
        id.setLocalName(receptor);
        acl.addReceiver(id);
        acl.setSender(agenteEmisor.getAID());
//                    acl.setEncoding("utf8mb4");
        acl.setLanguage(FIPANames.ContentLanguage.FIPA_SL);
        try {
            acl.setContentObject(contenido);
        } catch (IOException ex) {
            Logger.getLogger(EnviarMensaje.class.getName()).log(Level.SEVERE, null, ex);
        }
        acl.setConversationId(conversationID);
        agenteEmisor.send(acl);
    }

    public int messageSend(){
        return 1;
    }

    public int messageFailure(){
        return 0;
    }

    public int messageTempOK(){
        return 1;
    }

    public int messageTempF(){
        return 0;
    }
}
