package gestor;

import java.util.Scanner;

public class BuscarCliente implements Tarea {
    public void tarea(final Gestor gestor) {
        System.out.print("Introduzca el NIF: ");
        Scanner teclado = new Scanner(System.in);
        String nif = teclado.next();
        Cliente cliente = gestor.clientes.containsKey(nif) ? gestor.clientes.get(nif) : new Cliente("No encontrado", " ");
        System.out.println(cliente);
    }
}
