public class Main {
    public static void main(String[] args) {
        Persona novia = new Persona("Ana");
        Persona padrino = new Persona("Carlos");
        Persona musico = new Persona("Luis");

        Rol cortarPastel = new Rol("Cortar el pastel", "corta el pastel");
        Rol primerVals = new Rol("Bailar el primer vals", "baila el primer vals");
        Rol tocarMusica = new Rol("Tocar música", "toca música");

        novia.agregarRol(cortarPastel);
        padrino.agregarRol(primerVals);
        musico.agregarRol(tocarMusica);

        novia.ejecutarRoles();
        padrino.ejecutarRoles();
        musico.ejecutarRoles();
    }
}