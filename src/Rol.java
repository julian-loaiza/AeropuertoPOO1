// Clase Rol
public class Rol extends BaseEntity {
    private String nombreRol;
    private Set<Usuario> usuarios;

    public Rol(String nombreRol) {
        super();
        this.nombreRol = nombreRol;
        this.usuarios = new HashSet<>();
    }
    // Métodos para manejar la relación con Usuario
    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
        usuario.setRol(this);
    }

    public void removeUsuario(Usuario usuario) {
        usuarios.remove(usuario);
        usuario.setRol(null);
    }

    public Set<Usuario> getUsuarios() {
        return Collections.unmodifiableSet(usuarios);
    }

    // Getters y setters
    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
}