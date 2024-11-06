import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        try {
            // Formato para fechas
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            System.out.println("=== Iniciando Sistema de Gestión de Aerolínea ===\n");

            // 1. Crear modelos de avión
            System.out.println("Creando modelos de avión...");
            ModeloAvion boeing737 = new ModeloAvion("B737", 180);
            ModeloAvion airbus320 = new ModeloAvion("A320", 150);
            System.out.println("- Creado " + boeing737.getCodigo() + " con capacidad de " + boeing737.getCapacidad());
            System.out.println("- Creado " + airbus320.getCodigo() + " con capacidad de " + airbus320.getCapacidad() + "\n");

            // 2. Crear aeropuertos
            System.out.println("Creando aeropuertos...");
            Aeropuerto madridAirport = new Aeropuerto("MAD", "Adolfo Suárez Madrid-Barajas", "Madrid", "España");
            Aeropuerto barcelonaAirport = new Aeropuerto("BCN", "El Prat", "Barcelona", "España");
            Aeropuerto parisAirport = new Aeropuerto("CDG", "Charles de Gaulle", "París", "Francia");
            System.out.println("- Creado aeropuerto " + madridAirport.getNombre());
            System.out.println("- Creado aeropuerto " + barcelonaAirport.getNombre());
            System.out.println("- Creado aeropuerto " + parisAirport.getNombre() + "\n");

            // 3. Crear programas de vuelo
            System.out.println("Creando programas de vuelo...");
            ProgramaVuelo programaMadridParis = new ProgramaVuelo("IB3444", boeing737, "Iberia", "Lunes-Viernes");
            ProgramaVuelo programaBarcelonaParis = new ProgramaVuelo("VY8101", airbus320, "Vueling", "Lunes-Domingo");
            System.out.println("- Creado programa de vuelo " + programaMadridParis.getNumeroVuelo());
            System.out.println("- Creado programa de vuelo " + programaBarcelonaParis.getNumeroVuelo() + "\n");

            // 4. Crear vuelos específicos
            System.out.println("Creando vuelos...");
            Vuelo vueloMadridParis1 = new Vuelo(
                    programaMadridParis.getNumeroVuelo(),
                    boeing737,
                    dateFormat.parse("15/11/2024"),
                    150,
                    programaMadridParis
            );

            Vuelo vueloBarcelonaParis1 = new Vuelo(
                    programaBarcelonaParis.getNumeroVuelo(),
                    airbus320,
                    dateFormat.parse("15/11/2024"),
                    120,
                    programaBarcelonaParis
            );

            // Agregar vuelos a sus programas
            programaMadridParis.addVuelo(vueloMadridParis1);
            programaBarcelonaParis.addVuelo(vueloBarcelonaParis1);

            System.out.println("- Creado vuelo " + vueloMadridParis1.getNumeroVuelo() +
                    " para fecha " + dateFormat.format(vueloMadridParis1.getFecha()));
            System.out.println("- Creado vuelo " + vueloBarcelonaParis1.getNumeroVuelo() +
                    " para fecha " + dateFormat.format(vueloBarcelonaParis1.getFecha()) + "\n");

            // 5. Crear escalas técnicas
            System.out.println("Creando escalas técnicas...");
            EscalaTecnica escalaMadrid = new EscalaTecnica(1, programaMadridParis.getNumeroVuelo(),
                    madridAirport, programaMadridParis);
            EscalaTecnica escalaBarcelona = new EscalaTecnica(2, programaBarcelonaParis.getNumeroVuelo(),
                    barcelonaAirport, programaBarcelonaParis);

            // Agregar escalas a aeropuertos y programas
            madridAirport.addEscala(escalaMadrid);
            barcelonaAirport.addEscala(escalaBarcelona);
            programaMadridParis.addEscala(escalaMadrid);
            programaBarcelonaParis.addEscala(escalaBarcelona);

            System.out.println("- Creada escala en " + escalaMadrid.getAeropuerto().getNombre());
            System.out.println("- Creada escala en " + escalaBarcelona.getAeropuerto().getNombre() + "\n");

            // 6. Crear roles y usuarios
            System.out.println("Creando roles y usuarios...");
            Rol rolAdmin = new Rol("Administrador");
            Rol rolOperador = new Rol("Operador");

            Usuario admin = new Usuario("Admin Principal", "admin@aerolinea.com", "hash123", rolAdmin);
            Usuario operador = new Usuario("Operador 1", "operador@aerolinea.com", "hash456", rolOperador);

            // Agregar usuarios a roles
            rolAdmin.addUsuario(admin);
            rolOperador.addUsuario(operador);

            System.out.println("- Creado usuario " + admin.getNombre() + " con rol " + admin.getRol().getNombreRol());
            System.out.println("- Creado usuario " + operador.getNombre() + " con rol " + operador.getRol().getNombreRol() + "\n");

            // 7. Crear logs de ejemplo
            System.out.println("Creando registros de log...");
            Log logAdmin = new Log(admin, "LOGIN", "Inicio de sesión exitoso");
            Log logOperacion = new Log(operador, "CREAR_VUELO", "Creación de vuelo " + vueloMadridParis1.getNumeroVuelo());

            // Agregar logs a usuarios
            admin.addLog(logAdmin);
            operador.addLog(logOperacion);

            System.out.println("- Creado log: " + logAdmin.getAccion() + " - " + logAdmin.getDetalles());
            System.out.println("- Creado log: " + logOperacion.getAccion() + " - " + logOperacion.getDetalles() + "\n");

            // 8. Mostrar algunas relaciones
            System.out.println("=== Resumen de relaciones ===");
            System.out.println("Vuelos del programa " + programaMadridParis.getNumeroVuelo() + ": " +
                    programaMadridParis.getVuelos().size());
            System.out.println("Escalas del aeropuerto " + madridAirport.getNombre() + ": " +
                    madridAirport.getEscalas().size());
            System.out.println("Usuarios con rol " + rolAdmin.getNombreRol() + ": " +
                    rolAdmin.getUsuarios().size());
            System.out.println("Logs del usuario " + admin.getNombre() + ": " +
                    admin.getLogs().size());

        } catch (Exception e) {
            System.err.println("Error durante la ejecución: " + e.getMessage());
            e.printStackTrace();
        }
    }
}