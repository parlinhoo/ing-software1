public class ControladorDePedidos {
    private List<Hogar> listaHogares = new LinkedList<Hogar>();
    private List<Pedido> listaPedidos = new LinkedList<Pedido>();

    public void registrarPedido(Habitante h, Direccion d, GeographicCoordinate c) {
        Hogar hogarSelec = null;
        Iterator<Direccion> it = listaHogares.iterator();
        while (it.hasNext()) {
            Hogar actual = it.next();
            if (actual.getHabitante().equals(h) && actual.getDireccion().equals(d)) {
                hogarSelec = actual;
                break;
            }
        }    
        if (hogarSelec == null) {
            hogarSelec = new Hogar(listaHogares.size(), h, d);
            listaHogares.add(hogarSelec);
        }
        
        listaPedidos.add(new Pedido(listaPedidos.size(), "En Espera", _fechaActual(), c, hogarSelec));
    }
}
