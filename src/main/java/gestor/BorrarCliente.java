package gestor;

import java.util.Scanner;

public class BorrarCliente implements Tarea {
    public void tarea(final Gestor gestor) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("NIF: ");
        gestor.clientes.remove(teclado.next());
    }
}
