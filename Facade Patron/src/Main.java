// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.agregarCarrito(1);
        int cantidad  = cliente1.agregarCarrito(2);
        System.out.println(cantidad);
        cliente1.Pagar();

    }
}