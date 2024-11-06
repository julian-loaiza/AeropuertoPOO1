// Clase abstracta base para vuelos
public abstract class VueloBase extends BaseEntity {
    protected String numeroVuelo;
    protected ModeloAvion modeloAvion;

    public VueloBase(String numeroVuelo, ModeloAvion modeloAvion) {
        super();
        this.numeroVuelo = numeroVuelo;
        this.modeloAvion = modeloAvion;
    }

    // Getters y setters
    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public ModeloAvion getModeloAvion() {
        return modeloAvion;
    }

    public void setModeloAvion(ModeloAvion modeloAvion) {
        this.modeloAvion = modeloAvion;
    }
}