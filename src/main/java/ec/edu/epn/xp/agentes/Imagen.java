package ec.edu.epn.xp.agentes;

import java.io.Serializable;

public class Imagen implements Serializable {

    private String etiqueta, fuente;

    public Imagen(String nombre, String url) {
        this.etiqueta = nombre;
        this.fuente = url;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }
}
