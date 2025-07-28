public class Rol {
    private String nombre;
    private String accion;

    public Rol(String nombre, String accion) {
        this.nombre = nombre;
        this.accion = accion;
    }

    public String getAccion() {
        return accion;
    }

    public void ejecutar() {
        System.out.println(accion);
    }

    public String getNombre() {
        return nombre;
    }
}