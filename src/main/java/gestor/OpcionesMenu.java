package gestor;

public enum OpcionesMenu {
    SALIR("Salir.", new Salir()),
    NUEVO_CLIENTE("Añadir un nuevo cliente.", new NuevoCliente()),
    BORRAR_CLIENTE("Borrar un cliente existente.", new BorrarCliente()),
    BUSCAR_CLIENTE("Buscar un cliente por nif.", new BuscarCliente()),
    LISTAR_CLIENTES("Listar todos los clientes.", new ListarClientes()),
    ACTUALIZAR_CLIENTE("Actualizar cliente", new ActualizarCliente());

    String textoOpcion;
    Tarea tarea;

    private OpcionesMenu(String textoOpcion, Tarea tarea) {
        this.textoOpcion = textoOpcion;
        this.tarea = tarea;
    }

    public static OpcionesMenu getOpcion(int posicion) {
        return values()[posicion];
    }

    public static String getMenu() {
        StringBuilder sb = new StringBuilder();
        for(OpcionesMenu opcion: OpcionesMenu.values()) {
            sb.append(opcion.ordinal());
            sb.append(".- ");
            sb.append(opcion.textoOpcion);
            sb.append("\n");
        }
        return sb.toString();
    }
}
