- **UC1**: "Ingresar solicitud de retiro"
	- Actor principal: Habitante
	- Actores secundarios: API Geo-localización
	- Pre-condiciones: 
		- Usuario `Habitante` registrado al sistema con una cuenta
	- Post-condiciones:
		- Pedido es registrado al sistema
		- Pedido es marcado como disponible para asignar a recolector (Pendiente)
		- Pedido es agregado a una ruta y a una zona de recolección
	- Flujo básico:
		1. Habitante selecciona la opción "Ingresar solicitud de retiro"
		2. Habitante ingresa una dirección de retiro manualmente o mediante API externa de GPS. 
		3. Sistema valida la ubicación en ambos casos, ejecutando **UC2**: "Validar ubicación automáticamente". La API también retorna coordenadas para construir las rutas de recolección más tarde.
		4. Sistema ingresa solicitud de retiro, con usuario, dirección y coordenadas asociadas, a la base de datos interna.
		5. Sistema marca la solicitud de retiro como "Pendiente", es decir, disponible para ser asignada a recolector.
		6. Sistema agrega solicitud de retiro a una ruta y zona de recolección existentes.
		7. Sistema notifica a Habitante de solicitud exitosa.
	- Extensiones:
		- 3' Ubicación inválida: Si la ubicación está fuera de la zona de operación, o no es validada exitosamente por la API de geo-localización, se termina el flujo y se devuelve un mensaje de error al usuario.
		- 4' 5' Error en el registro: Si ocurre un error al intentar registrar el pedido a la base de datos, se notifica al habitante de esto, y en consecuencia, el pedido no es registrado ni agregado a zonas.
		- 6' Zona o ruta no existentes: Si la coordenada del pedido no cae en una vecindad **suficientemente cerca** de una zona o ruta, se crean una zona y/o una ruta nueva y se agrega el pedido a esta(s).

- **UC2**: "Validar ubicación automáticamente"
	- Actor principal: API Geo-localización
	- Actores secundarios: Habitante, Sistema
	- Pre-condiciones:
		- Iniciado por **UC1:** "Ingresar solicitud de retiro", llamado por Sistema
		- Requiere ingreso de ubicación geográfica mediante algún tipo de codificación (ej. coordenadas)
	- Post-condiciones:
		- Ubicación ingresada es retornada como "válida" o "inválida"
	- Flujo básico: 
		1. Sistema recibe dirección de Habitante y transforma a un formato compatible on API de Geo-localización.
		2. Sistema llama a API de Geo-localización e ingresa ubicación
		3. API realiza proceso interno para validar ubicación, o rechazarla como inválida
		4. Sistema recibe resultado de validación y la utiliza para proceder con flujo de **UC1**: "Ingresar solicitud de retiro".
	- Extensiones
		- N/A
