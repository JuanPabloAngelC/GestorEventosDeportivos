package com.sportsevent.gestoreventosdeportivos.Servlet;

import com.sportsevent.gestoreventosdeportivos.Service.EstadisticaService;
import com.sportsevent.gestoreventosdeportivos.Service.EventoService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "EstadisticaServlet", urlPatterns = "/estadisticas")
public class EstadisticaServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EstadisticaService.obtenerEstadisticas(request, response);
    }
}
