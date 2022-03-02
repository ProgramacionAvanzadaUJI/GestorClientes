package gestor;

import java.util.Scanner;

public class NuevoCliente implements Tarea{
    public void tarea(final Gestor gestor) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("NIF: ");
        String nif = teclado.next();
        System.out.print("Nombre: ");
        String nombre = teclado.next();
        gestor.clientes.put(nif, new Cliente(nif, nombre));
    }
}
