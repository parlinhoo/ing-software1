public class Ruta {
    private List<Parada> paradas = new LinkedList<Parada>();

    public void add(Parada parada) {
        paradas.add(parada);
    }

    public void remove(Parada parada) {
        paradas.remove(parada);
    }
}
