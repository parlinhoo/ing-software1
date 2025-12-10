public class Hogar {
    private int idHogar;
    private Habitante habitante;
    private Direccion direccion;

    public Hogar(int idHogar, Habitante hab, Direccion dir) {
        this.idHogar = idHogar;
        this.habitante = hab;
        this.direccion = dir;
    }
}
