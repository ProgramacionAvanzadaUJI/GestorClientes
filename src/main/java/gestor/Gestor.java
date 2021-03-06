package gestor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gestor {
    static final Map<String, Cliente> clientes = new HashMap<>();
    private final transient Scanner teclado = new Scanner(System.in);


    void salir() {
//        System.out.println("Adios");
//        System.exit(0);
        new Salir().tarea(this);
    }

    void listarClientes() {
//        for(Cliente cliente: clientes.values()) {
//            System.out.println(cliente);
//        }
        new ListarClientes().tarea(this);
    }

    void buscarCliente() {
//        System.out.print("Introduzca el NIF: ");
//        Scanner teclado = new Scanner(System.in);
//        String nif = teclado.next();
//        Cliente cliente = clientes.containsKey(nif) ? clientes.get(nif) : new Cliente("No encontrado", " ");
//        System.out.println(cliente);
        new BuscarCliente().tarea(this);
    }

    void borrarCliente() {
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("NIF: ");
//        clientes.remove(teclado.next());
        new BorrarCliente().tarea(this);
    }

    void nuevoCliente() {
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("NIF: ");
//        String nif = teclado.next();
//        System.out.print("Nombre: ");
//        String nombre = teclado.next();
//        clientes.put(nif, new Cliente(nif, nombre));
        new NuevoCliente().tarea(this);
    }
}
