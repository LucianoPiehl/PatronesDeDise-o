public class Cliente {
    private TiendaOnlineFacade facade;
    private Producto[] carrito;
    private String dirrecionEntrega;
    int clienteId;

    public void Pagar(){
        for (Producto producto: carrito) {
            facade.procesarPedido(clienteId,producto.getProductoid(),producto.getCantidad(),dirrecionEntrega);
        }
    }
}
