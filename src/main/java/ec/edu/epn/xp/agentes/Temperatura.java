package ec.edu.epn.xp.agentes;

import java.io.Serializable;

public class Temperatura implements Serializable {
    private String valorTemperatura;

    public Temperatura(String valorTemperatura) {
        this.valorTemperatura = valorTemperatura;
    }

    public String getValorTemperatura() {
        return valorTemperatura;
    }

    public void setValorTemperatura(String valorTemperatura) {
        this.valorTemperatura = valorTemperatura;
    }
}
