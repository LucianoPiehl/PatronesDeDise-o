public class TiendaOnlineFacade{
    private InventarioSubsystem inventarioSubsystem;
    private FacturacionSubsystem facturacionSubsystem;
    private EnvioSubsystem envioSubsystem;

    public TiendaOnlineFacade() {
        inventarioSubsystem = new InventarioSubsystem();
        facturacionSubsystem = new FacturacionSubsystem();
        envioSubsystem = new EnvioSubsystem();
    }

    public boolean procesarPedido(int clienteId, int productoId, int cantidad, String direccionEntrega) {
        if (inventarioSubsystem.verificarDisponibilidadProducto(productoId, cantidad)) {
            int facturaId = facturacionSubsystem.generarFactura(clienteId, productoId, cantidad);
            envioSubsystem.programarEnvio(facturaId, direccionEntrega);
            return true; // Pedido procesado con éxito
        }
        return false; // No hay suficiente inventario
    }
}
