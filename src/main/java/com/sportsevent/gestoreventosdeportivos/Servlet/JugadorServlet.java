package com.sportsevent.gestoreventosdeportivos.Servlet;

import com.sportsevent.gestoreventosdeportivos.Service.JugadorService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "JugadorServlet", urlPatterns = "/jugadores")
public class JugadorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        JugadorService.registrarJugador(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        JugadorService.obtenerJugadores(request, response);
    }
}