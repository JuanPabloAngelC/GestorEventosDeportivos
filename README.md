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

