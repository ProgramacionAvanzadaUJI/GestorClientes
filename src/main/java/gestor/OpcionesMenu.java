package gestor;

public enum OpcionesMenu {
    SALIR("Salir."),
    NUEVO_CLIENTE("Añadir un nuevo cliente."),
    BORRAR_CLIENTE("Borrar un cliente existente."),
    BUSCAR_CLIENTE("Buscar un cliente por nif."),
    LISTAR_CLIENTES("Listar todos los clientes.");

    String textoOpcion;

    private OpcionesMenu(String textoOpcion) {
        this.textoOpcion = textoOpcion;
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
