public class Habitante {
    private String nombre;
    private String rut;
    private List<Direccion> direcciones;

    public void ingresarDireccion(String calle, int num_calle, String ciudad, String region) {
        boolean isValid = API_Geo.validarDireccion(calle, num_calle, ciudad, region);
        if (!isValid) return;

        Iterator<Direccion> it = direcciones.iterator();
        while (it.hasNext()) {
            Direccion actual = it.next();
            if ( calle.equals(actual.getCalle()) && num_calle == actual.getNumCalle() 
               && ciudad.equals(actual.getCiudad()) && region.equals(actual.getRegion()) ) {
                return; 
            }
        }    

        direcciones.add(new Direccion(calle, num_calle, ciudad, region));
    }

    public Habitante(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut
    }
}
