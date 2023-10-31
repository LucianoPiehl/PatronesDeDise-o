import java.util.ArrayList;

public class Cliente {
    private TiendaOnlineFacade facade;
    private ArrayList<Producto> carrito;
    private String dirrecionEntrega;
    int clienteId;
    public Cliente(){
        carrito = new ArrayList<>();
        facade = new TiendaOnlineFacade();
        dirrecionEntrega = "AV bunge";
    }
    public int agregarCarrito(int cantidad){
        carrito.add(new Producto(cantidad));
        return carrito.size();
    }

    public void Pagar(){
        for (Producto producto: carrito) {
            facade.procesarPedido(clienteId,producto.getProductoid(),producto.getCantidad(),dirrecionEntrega);
        }
    }
}
