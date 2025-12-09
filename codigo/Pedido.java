public class Pedido {
    private int idPedido;
    private String estado;
    private DateTime fechaHora;
    private GeographicCoordinate coordenadas;

    public setEstado(String e) {
        this.estado = e;
    }

    public Pedido(int idPedido, String estado, DateTime fechaHora, GeographicCoordinate coordenadas) {
        this.idPedido = idPedido;
        this.estado = estado;
        this.fechaHora = fechaHora;
        this.coordenadas = coordenadas;
    }
}
