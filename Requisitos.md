## Requisitos funcionales y no funcionales

RF1: El sistema web debe permitir al usuario de tipo “habitante” ingresar solicitudes de retiro de material reciclable a su domicilio, con validación de ubicación geográfica. (automática o previamente ingresada)

RF2: El sistema debe emitir una lista de solicitudes de recolección que estén disponibles para ser aceptadas por recolectores, dentro de un área local alrededor del usuario recolector visualizada a través de un mapa.

RF3: El sistema debe generar y proporcionar una visualización de la ruta más corta entre los domicilios cuyas solicitudes fueron aceptadas por el usuario recolector.

RF4: El sistema debe permitir a los usuarios ingresar y modificar datos personales relevantes para el funcionamiento de este. En el caso de “habitantes”, esto incluiría la dirección del domicilio, nombre, o detalles opcionales adicionales de la ubicación. En el caso de “recolectores”, esto incluiría la patente del vehículo y el nombre del conductor.

RF5: El sistema debe permitir a los usuarios consultar el estado de su solicitud de recolección, como mínimo teniendo estados “No aceptada”, “En curso” y “Terminada”. Cada estado debe además contener información relevante, como un tiempo de espera estimado para solicitudes en progreso, y una fecha y hora de completación para solicitudes terminadas.

RF6: El sistema debe permitir a los usuarios “recolectores” reportar la completación de pedidos que hayan aceptado, lo cual debe verse reflejado en todo el sistema, y generar comprobantes visibles para ambos ellos y para usuarios “habitantes”.

RNF1: La interfaz debe ser rápida e intuitiva para los “habitantes”, poniendo como enfoque principal una solicitud rápida de recolección, mientras que otras opciones o configuraciones queden más “alejadas” de la vista principal. Para los “recolectores”, la interfaz debe concentrarse en la ruta que deben tomar los recolectores, dejando las solicitudes de pedidos, datos de la recolección actual y otros como ventanas pequeñas o separadas de la interfaz principal, tomando como ejemplo aplicaciones de pedidos.

RNF2: El sistema debe tener un sistema de autenticación mediante usuario y contraseña para evitar que cualquier persona entre con la cuenta de un usuario que no le corresponde.

RNF3: La navegación y rutas de recolección debe soportar desconexiones de la red mientras se realicen y los pedidos que se completan sin conexión deben ser enviados al momento que vuelve.

RNF4: El sistema debe asegurarse que los “habitantes” se encuentren cerca del punto de recolección, ya sea para evitar errores de dirección como también evitar pedidos falsos.
