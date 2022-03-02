package gestor;

import java.util.Scanner;

public class Menu {
    private final transient Scanner teclado = new Scanner(System.in);
    Gestor gestor = new Gestor();

    public void ejecuta() {
        OpcionesMenu opcion = OpcionesMenu.SALIR;

        do {
            System.out.println(OpcionesMenu.getMenu());
            opcion = pideOpcion();
            filtraOpcion(opcion);
        } while(true);
    }

    private OpcionesMenu pideOpcion() {
        System.out.println("Qué opción desea: ");

        return OpcionesMenu.getOpcion(teclado.nextInt());
    }

    void filtraOpcion(final OpcionesMenu opcion) {
        opcion.tarea.tarea(gestor);
    }
}
