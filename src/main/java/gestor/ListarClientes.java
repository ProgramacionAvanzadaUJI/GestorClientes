package gestor;

public class ListarClientes implements Tarea {
    public void tarea(final Gestor gestor) {
        for(Cliente cliente: gestor.clientes.values()) {
            System.out.println(cliente);
        }
    }
}
