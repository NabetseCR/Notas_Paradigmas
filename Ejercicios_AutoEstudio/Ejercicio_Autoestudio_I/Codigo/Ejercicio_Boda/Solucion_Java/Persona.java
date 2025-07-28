import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private List<Rol> roles = new ArrayList<>();

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void agregarRol(Rol rol) {
        roles.add(rol);
    }

    public void ejecutarRoles() {
        for (Rol rol : roles) {
            System.out.println(nombre + " realiza: " + rol.getAccion());
        }
    }

    public String getNombre() {
        return nombre;
    }
}