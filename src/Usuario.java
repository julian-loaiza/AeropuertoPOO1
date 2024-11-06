// Clase Usuario
public class Usuario extends BaseEntity {
    private String nombre;
    private String email;
    private String contraseniaHash;
    private Rol rol;
    private List<Log> logs;

    public Usuario(String nombre, String email, String contraseniaHash, Rol rol) {
        super();
        this.nombre = nombre;
        this.email = email;
        this.contraseniaHash = contraseniaHash;
        this.rol = rol;
        this.logs = new ArrayList<>();
    }

    // Métodos para manejar la relación con Log
    public void addLog(Log log) {
        logs.add(log);
        log.setUsuario(this);
    }

    public void removeLog(Log log) {
        logs.remove(log);
        log.setUsuario(null);
    }

    public List<Log> getLogs() {
        return Collections.unmodifiableList(logs);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseniaHash() {
        return contraseniaHash;
    }

    public void setContraseniaHash(String contraseñaHash) {
        this.contraseniaHash = contraseñaHash;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}