public class Parada {
    private int orden;
    private List<Pedido> pedidos = new LinkedList<Pedido>();
    
    public Parada(int orden) {
        this.orden = orden;
    }

    public void add(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void remove(Pedido pedido) {
        pedidos.remove(pedido);
    }
}
