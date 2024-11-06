import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// Clase Aeropuerto
public class Aeropuerto extends BaseEntity {
    private String codigo;
    private String nombre;
    private String ciudad;
    private String pais;
    private List<EscalaTecnica> escalas;

    public Aeropuerto(String codigo, String nombre, String ciudad, String pais) {
        super();
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.escalas = new ArrayList<>();
    }
    // Métodos para manejar la relación con EscalaTecnica
    public void addEscala(EscalaTecnica escala) {
        escalas.add(escala);
        escala.setAeropuerto(this);
    }

    public void removeEscala(EscalaTecnica escala) {
        escalas.remove(escala);
        escala.setAeropuerto(null);
    }

    public List<EscalaTecnica> getEscalas() {
        return Collections.unmodifiableList(escalas);
    }


    // Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}