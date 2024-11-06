import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// Clase ModeloAvion
public class ModeloAvion extends BaseEntity {
    private String codigo;
    private Integer capacidad;
    private List<Vuelo> vuelos;

    public ModeloAvion(String codigo, Integer capacidad) {
        super();
        this.codigo = codigo;
        this.capacidad = capacidad;
        this.vuelos = new ArrayList<>();
    }

    // Métodos para manejar la relación con Vuelo
    public void addVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
        vuelo.setModeloAvion(this);
    }

    public void removeVuelo(Vuelo vuelo) {
        vuelos.remove(vuelo);
        vuelo.setModeloAvion(null);
    }

    public List<Vuelo> getVuelos() {
        return Collections.unmodifiableList(vuelos);
    }


    // Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
}