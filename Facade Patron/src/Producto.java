public class Producto {
    private int productoid;
    private int cantidad;
    static int generador = 1;

    public Producto(int cantidad) {
        this.productoid = generador++;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getProductoid(){
        return productoid;
    }
}
