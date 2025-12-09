public class Direccion {
    private String nombreCalle;
    private int numCalle;
    private String ciudad;
    private String region;

    public Direccion(String nombreCalle, int numCalle, String ciudad, String region) {
        boolean result = API_Geo.validarDireccion(nombreCalle, numCalle, ciudad, region);

        // TODO

        this.nombreCalle = nombreCalle;
        this.numCalle = numCalle;
        this.ciudad = ciudad;
        this.region = region;
    }
}
