// Clase Vuelo
public class Vuelo extends VueloBase {
    private Date fecha;
    private Integer plazasVacias;
    private ProgramaVuelo programaVuelo;

    public Vuelo(String numeroVuelo, ModeloAvion modeloAvion,
                 Date fecha, Integer plazasVacias) {
        super(numeroVuelo, modeloAvion);
        this.fecha = fecha;
        this.plazasVacias = plazasVacias;
        this.programaVuelo = programaVuelo;
    }

    public ProgramaVuelo getProgramaVuelo() {
        return programaVuelo;
    }

    public void setProgramaVuelo(ProgramaVuelo programaVuelo) {
        this.programaVuelo = programaVuelo;
    }

    // Getters y setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getPlazasVacias() {
        return plazasVacias;
    }

    public void setPlazasVacias(Integer plazasVacias) {
        this.plazasVacias = plazasVacias;
    }
}
