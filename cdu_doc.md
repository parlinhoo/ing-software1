- **UC1**: "Ingresar solicitud de retiro"
	- Actor principal: Habitante
	- Actores secundarios: API Geo-localización
	- Pre-condiciones: 
		- Usuario `Habitante` registrado al sistema con una cuenta
	- Post-condiciones:
		- Pedido es registrado al sistema
		- Pedido es asignado a zona de recolección existente o nueva
		- Pedido es marcado como disponible para asignar a recolector
	- Flujo básico:
		1. Habitante selecciona la opción "Ingresar solicitud de retiro"
		2. Habitante ingresa una dirección de retiro manualmente o mediante API externa de GPS. 
		3. Sistema valida la ubicación en ambos casos, ejecutando **UC2**: "Validar ubicación automáticamente".
		4. Sistema ingresa solicitud de retiro, con usuario y dirección asociadas, a la base de datos interna. **El usuario es notificado de la solicitud registrada exitosamente**.
		5. Sistema añade solicitud de retiro a zona de recolección nueva o existente, ejecutando otro **UC**: Agregar solicitud a zona de recolección
	- Extensiones:
		- 3' Ubicación inválida: Si la ubicación está fuera de la zona de operación, o no es validada exitosamente por la API de geo-localización, se termina el flujo y se devuelve un mensaje de error al usuario.
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
