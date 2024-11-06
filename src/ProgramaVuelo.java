// Clase ProgramaVuelo
public class ProgramaVuelo extends VueloBase {
    private String lineaAerea;
    private String diasOperacion;
    private List<Vuelo> vuelos;
    private List<EscalaTecnica> escalas;

    public ProgramaVuelo(String numeroVuelo, ModeloAvion modeloAvion,
                         String lineaAerea, String diasOperacion) {
        super(numeroVuelo, modeloAvion);
        this.lineaAerea = lineaAerea;
        this.diasOperacion = diasOperacion;
        this.vuelos = new ArrayList<>();
        this.escalas = new ArrayList<>();
    }

    // Métodos para manejar la relación con Vuelo
    public void addVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
        vuelo.setProgramaVuelo(this);
    }

    public void removeVuelo(Vuelo vuelo) {
        vuelos.remove(vuelo);
        vuelo.setProgramaVuelo(null);
    }

    public List<Vuelo> getVuelos() {
        return Collections.unmodifiableList(vuelos);
    }

    // Métodos para manejar la relación con EscalaTecnica
    public void addEscala(EscalaTecnica escala) {
        escalas.add(escala);
        escala.setProgramaVuelo(this);
    }

    public void removeEscala(EscalaTecnica escala) {
        escalas.remove(escala);
        escala.setProgramaVuelo(null);
    }

    public List<EscalaTecnica> getEscalas() {
        return Collections.unmodifiableList(escalas);
    }

    // Getters y setters
    public String getLineaAerea() {
        return lineaAerea;
    }

    public void setLineaAerea(String lineaAerea) {
        this.lineaAerea = lineaAerea;
    }

    public String getDiasOperacion() {
        return diasOperacion;
    }

    public void setDiasOperacion(String diasOperacion) {
        this.diasOperacion = diasOperacion;
    }
}
