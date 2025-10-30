## Funcionales

RF1: El sistema web debe permitir al usuario tipo “habitante” ingresar solicitudes de retiro de material reciclable a su domicilio.

RF2: sistema debe, para cada solicitud de retiro, poder validar la ubicación geográfica automáticamente para así verificar que el pedido tenga una ubicación correcta, y asegurarse que el "Habitante" que la peticiona se encuentre cerca de ella.

RF3: El sistema debe permitir a usuarios "Recolectores" operar rutas de recolección asignadas a ellos por un "Coordinador de Ruta".

RF4: El sistema debe generar rutas de viaje automáticamente a partir de un conjunto de ubicaciones de pedidos de recolección.

RF5: El sistema debe permitir a ``Coordinadores de ruta'' asignar rutas a conductores disponibles.

RF6: El sistema debe permitir a los usuarios ingresar y modificar datos personales relevantes para el funcionamiento de este. En el caso de "habitantes", esto incluiría la dirección del domicilio, nombre, o detalles opcionales adicionales de la ubicación. En el caso de “recolectores”, esto incluiría la patente del vehículo y el nombre del conductor.

RF7: El sistema debe permitir a los usuarios consultar el estado de su solicitud de reciclaje, como mínimo teniendo estados "No aceptada", "En curso" y "Terminada". Cada estado debe además contener información relevante, como un tiempo de espera estimado para solicitudes en progreso, y una fecha y hora de completación para solicitudes terminadas.

RF8: El sistema debe permitir a los usuarios "recolectores" reportar el resultado de cada pedido en una ruta, lo cual debe verse reflejado en todo el sistema, y generar comprobantes de cada resultado que deben ser visibles a "habitantes".

---
## No Funcionales

RNF1: La interfaz debe ser rápida e intuitiva para los "habitantes", poniendo como enfoque principal una solicitud rápida de recolección, mientras que otras opciones o configuraciones queden más "alejadas" de la vista principal.

RNF2: De la misma manera, la interfaz para los "recolectores" debe cumplir lo anterior, y además debe concentrarse en la ruta que deben tomar los recolectores, dejando las solicitudes de pedidos, datos de la recolección actual y otros como ventanas pequeñas o separadas de la interfaz principal, tomando como ejemplo aplicaciones de pedidos.

RNF3: El sistema debe tener un sistema de autenticación mediante usuario y contraseña.

RNF4: La navegación y rutas de recolección debe ser resiliente a interrupciones en la red mientras se realicen los pedidos. En particular, se requiere que los pedidos completados sin conexión sean procesados una vez la conexión se retome.
