package gestor;

import java.util.Scanner;

public class Menu {
    private final transient Scanner teclado = new Scanner(System.in);
    Gestor gestor = new Gestor();

    public void ejecuta() {
        int opcion = 0;

        do {
            System.out.println(OpcionesMenu.getMenu());
            opcion = pideOpcion();
            filtraOpcion(opcion);
        } while(true);
    }

    private int pideOpcion() {
        System.out.println("Qué opción desea: ");
        return teclado.nextInt();
    }

    void filtraOpcion(final int opcion) {
        switch (opcion){
            case 1:
                gestor.nuevoCliente();
                break;
            case 2:
                gestor.borrarCliente();
                break;
            case 3:
                gestor.buscarCliente();
                break;
            case 4:
                gestor.listarClientes();
                break;
            case 0:
                gestor.salir();
                break;
        }
    }
}
