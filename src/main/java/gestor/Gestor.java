package gestor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gestor {
    private static final Map<String, Cliente> clientes = new HashMap<>();
    private final transient Scanner teclado = new Scanner(System.in);

    public void ejecuta() {
        int opcion = 0;

        do {
            System.out.println(muestraMenu());
            opcion = pideOpcion();
            filtraOpcion(opcion);
        } while(true);
    }

    private int pideOpcion() {
        System.out.println("Qué opción desea: ");
        return teclado.nextInt();
    }

    String muestraMenu() {
        StringBuffer sb = new StringBuffer();
        sb.append("0. Salir\n");
        sb.append("1. Añadir un nuevo cliente.\n");
        sb.append("2. Borrar un cliente existente.\n");
        sb.append("3. Buscar un cliente por nif.\n");
        sb.append("4. Listar todos los clientes.\n");

        return sb.toString();
    }

    void filtraOpcion(final int opcion) {
        switch (opcion){
            case 1:
                nuevoCliente();
                break;
            case 2:
                borrarCliente();
                break;
            case 3:
                buscarCliente();
                break;
            case 4:
                listarClientes();
                break;
            case 0:
                salir();
                break;
        }
    }

    private void salir() {
        System.out.println("Adios");
        System.exit(0);
    }

    private void listarClientes() {
        for(Cliente cliente: clientes.values()) {
            System.out.println(cliente);
        }
    }

    private void buscarCliente() {
        System.out.print("Introduzca el NIF: ");
        Scanner teclado = new Scanner(System.in);
        String nif = teclado.next();
        Cliente cliente = clientes.containsKey(nif) ? clientes.get(nif) : new Cliente("No encontrado", " ");
        System.out.println(cliente);
    }

    private void borrarCliente() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("NIF: ");
        clientes.remove(teclado.next());
    }

    private void nuevoCliente() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("NIF: ");
        String nif = teclado.next();
        System.out.print("Nombre: ");
        String nombre = teclado.next();
        clientes.put(nif, new Cliente(nif, nombre));
    }
}
