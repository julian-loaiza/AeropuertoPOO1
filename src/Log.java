// Clase Log
public class Log extends BaseEntity {
    private Usuario usuario;
    private String accion;
    private String detalles;

    public Log(Usuario usuario, String accion, String detalles) {
        super();
        this.usuario = usuario;
        this.accion = accion;
        this.detalles = detalles;
    }

    // Getters y setters
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
}