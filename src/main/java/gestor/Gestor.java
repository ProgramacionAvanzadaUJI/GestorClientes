package gestor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gestor {
    private static final Map<String, Cliente> clientes = new HashMap<>();
    private final transient Scanner teclado = new Scanner(System.in);

//    public void ejecuta() {
//        int opcion = 0;
//
//        do {
//            System.out.println(OpcionesMenu.getMenu());
//            opcion = pideOpcion();
//            filtraOpcion(opcion);
//        } while(true);
//    }
//
//    private int pideOpcion() {
//        System.out.println("Qué opción desea: ");
//        return teclado.nextInt();
//    }
//
//    void filtraOpcion(final int opcion) {
//        switch (opcion){
//            case 1:
//                nuevoCliente();
//                break;
//            case 2:
//                borrarCliente();
//                break;
//            case 3:
//                buscarCliente();
//                break;
//            case 4:
//                listarClientes();
//                break;
//            case 0:
//                salir();
//                break;
//        }
//    }

    void salir() {
        System.out.println("Adios");
        System.exit(0);
    }

    void listarClientes() {
        for(Cliente cliente: clientes.values()) {
            System.out.println(cliente);
        }
    }

    void buscarCliente() {
        System.out.print("Introduzca el NIF: ");
        Scanner teclado = new Scanner(System.in);
        String nif = teclado.next();
        Cliente cliente = clientes.containsKey(nif) ? clientes.get(nif) : new Cliente("No encontrado", " ");
        System.out.println(cliente);
    }

    void borrarCliente() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("NIF: ");
        clientes.remove(teclado.next());
    }

    void nuevoCliente() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("NIF: ");
        String nif = teclado.next();
        System.out.print("Nombre: ");
        String nombre = teclado.next();
        clientes.put(nif, new Cliente(nif, nombre));
    }
}
