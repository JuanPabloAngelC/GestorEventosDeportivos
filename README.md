# GestorEventosDeportivos

Este proyecto es un sistema para gestionar eventos deportivos, equipos, jugadores y estadísticas. A continuación se presenta la estructura del proyecto y ejemplos de las peticiones HTTP que se pueden hacer a los endpoints del sistema.

## Estructura del Proyecto

```plaintext
GestorEventosDeportivos
├───src
│   ├───main
│   │   ├───java
│   │   │   └───com
│   │   │       └───sportsevent
│   │   │           └───gestoreventosdeportivos
│   │   │               ├───DAO                   // Gestión de la persistencia de datos (Base de Datos).
│   │   │               │   ├───EquipoDAO.java    // Operaciones de la tabla "Equipo".
│   │   │               │   ├───EventoDAO.java    // Operaciones de la tabla "Evento".
│   │   │               │   └───JugadorDAO.java   // Operaciones de la tabla "Jugador".
│   │   │               ├───Service                // Lógica de negocio del sistema.
│   │   │               │   ├───EquipoService.java // Lógica para registrar y gestionar equipos.
│   │   │               │   ├───EstadisticaService.java // Lógica para generar estadísticas y reportes.
│   │   │               │   ├───EventoService.java // Lógica para gestionar eventos deportivos.
│   │   │               │   └───JugadorService.java // Lógica para registrar y gestionar jugadores.
│   │   │               └───Servlet                // Puntos de entrada HTTP (endpoints) del sistema.
│   │   │                   ├───EquipoServlet.java // Servir las peticiones relacionadas con los equipos (registrar, obtener equipos, etc.).
│   │   │                   ├───EstadisticaServlet.java // Servir las peticiones para obtener estadísticas (eventos por deporte, promedio de jugadores, etc.).
│   │   │                   ├───EventoServlet.java // Servir las peticiones relacionadas con los eventos (registrar, obtener eventos, etc.).
│   │   │                   └───JugadorServlet.java // Servir las peticiones relacionadas con los jugadores (registrar, obtener jugadores, etc.).
```

## Endpoints

### Equipos

- **GET** `/equipos`  
  Obtiene la lista de equipos registrados.

- **POST** `/equipos`  
  Crea un nuevo equipo.

  Ejemplo de petición:

  ```json
  {
      "id": 1,
      "nombre": "Equipo A",
      "deporte": "Fútbol",
      "ciudad": "Madrid",
      "fechaFundacion": "1990-05-12",
      "logo": "logo.png",
      "jugadores": [
          101,
          102,
          103
      ]
  }
  ```

### Jugadores

- **GET** `/jugadores`  
  Obtiene la lista de jugadores registrados.

- **POST** `/jugadores`  
  Crea un nuevo jugador.

  Ejemplo de petición:

  ```json
  {
      "id": 1,
      "nombre": "Juan",
      "apellido": "Pérez",
      "fechaNacimiento": "1995-08-15",
      "nacionalidad": "Argentina",
      "posicion": "Delantero",
      "numero": 10,
      "equipoId": 1,
      "estadoActivo": true
  }
  ```

### Eventos

- **GET** `/eventos`  
  Obtiene la lista de eventos registrados.

- **POST** `/eventos`  
  Crea un nuevo evento.

  Ejemplo de petición:

  ```json
  {
      "nombre": "Final Copa Mundial 2025",
      "fecha": "2025-06-15T18:00:00",
      "lugar": "Estadio Nacional",
      "deporte": "Fútbol",
      "equiposParticipantes": [
          1,
          2
      ], 
      "capacidad": 50000,
      "entradasVendidas": 0,
      "estado": "Programado"
  }
  ```

- **PUT** `/eventos?accion=vender-entradas&eventoId=0&cantidad=1000`  
  Actualiza el evento para vender entradas.

- **PUT** `/eventos?accion=actualizar-estado&eventoId=0&estado=Cancelado`  
  Actualiza el estado del evento (ej. "Cancelado").

### Estadísticas

- **GET** `/estadisticas`  
  Obtiene las estadísticas relacionadas con los eventos, equipos y jugadores.
