package org.example.observe;

import java.util.ArrayList;
import java.util.List;

public class NotificadorTarea {
    private List<ObservadorTarea> observadores = new ArrayList<>();

    public void agregarObservador(ObservadorTarea observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(ObservadorTarea observador) {
        observadores.remove(observador);
    }

    public void enviarNotificacion(String nombreTarea) {
        for (ObservadorTarea observador : observadores) {
            observador.actualizar(nombreTarea);
        }
    }
}