import java.util.Objects;

public class EscalaTecnica extends BaseEntity {
    private Integer codigoEscala;
    private String numeroVuelo;
    private Aeropuerto aeropuerto;
    private ProgramaVuelo programaVuelo;

    public EscalaTecnica(Integer codigoEscala, String numeroVuelo, Aeropuerto aeropuerto, ProgramaVuelo programaVuelo) {
        super();
        this.codigoEscala = codigoEscala;
        this.numeroVuelo = numeroVuelo;
        this.aeropuerto = aeropuerto;
        this.programaVuelo = programaVuelo;
    }

    public ProgramaVuelo getProgramaVuelo() {
        return programaVuelo;
    }

    public void setProgramaVuelo(ProgramaVuelo programaVuelo) {
        this.programaVuelo = programaVuelo;
    }

    // Getters y setters
    public Integer getCodigoEscala() {
        return codigoEscala;
    }

    public void setCodigoEscala(Integer codigoEscala) {
        this.codigoEscala = codigoEscala;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Aeropuerto getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(Aeropuerto aeropuerto) {
        this.aeropuerto = aeropuerto;
    }
}