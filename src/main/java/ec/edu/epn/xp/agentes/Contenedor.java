package ec.edu.epn.xp.agentes;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.StaleProxyException;

public class Contenedor {
    AgentController agenteController;
    AgentContainer mainContainer;
    Object[] contenedor = new Object[1];

    public void ambienteContenedor() {
        jade.core.Runtime runtime = jade.core.Runtime.instance();

        runtime.setCloseVM(true);
        System.out.println("Runtime ha sido creado\n");

        Profile crearPerfilContenedor = new ProfileImpl("192.168.0.10", 1098, null);
        System.out.println("Perfil por defecto creado");

        mainContainer = runtime.createMainContainer(crearPerfilContenedor);
        System.out.println("Contenedor creado" + crearPerfilContenedor.toString());
        contenedor[0] = this;
        iniciarAgentes();
    }

    private void iniciarAgentes() {

        try {

            mainContainer.createNewAgent("AgenteReceptor", AgenteReceptor.class.getName(), null).start();
            mainContainer.createNewAgent("AgenteEmisor", AgenteEmisor.class.getName(), null).start();

        } catch (StaleProxyException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ec.edu.epn.xp.agentes.Contenedor().ambienteContenedor();
    }
}
