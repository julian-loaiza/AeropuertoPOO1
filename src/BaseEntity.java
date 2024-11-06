// Importaciones necesarias
import java.util.*;
// Clase base para entidades del sistema
public abstract class BaseEntity {
    protected Integer id;
    protected Date fechaCreacion;

    public BaseEntity() {
        this.fechaCreacion = new Date();
    }

    // Getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}