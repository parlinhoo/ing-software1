public class Habitante {
    private String nombre;
    private String rut;
    private List<Direccion> direcciones;

    public void ingresarDireccion(String calle, int num_calle, String ciudad, String region) {
        Iterator<Direccion> it = direcciones.iterator();
        // Verificar si la direccion ya esta antes de crear una nueva 
        while (it.hasNext()) {
            Direccion actual = it.next();
            if ( calle.equals(actual.getCalle()) && num_calle == actual.getNumCalle() 
               && ciudad.equals(actual.getCiudad()) && region.equals(actual.getRegion()) ) {

                // La dirección ya está registrada
                return; 
            }
        }    

        // Si llega hasta acá entonces no ha sido registrada

        direcciones.add(new Direccion(calle, num_calle, ciudad, region));
    }

    public Habitante(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut
    }
}
