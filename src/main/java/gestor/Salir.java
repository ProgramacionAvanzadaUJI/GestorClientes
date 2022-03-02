package gestor;

public class Salir implements Tarea {
    public void tarea(final Gestor gestor) {
        System.out.println("Adios");
        System.exit(0);
    }
}
