public class ZonaDeRecoleccion {
    private List<Pedido> pedidos = new LinkedList<Pedido>();

    public void add(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void remove(Pedido pedido) {
        pedidos.remove(pedido);
    }
}
