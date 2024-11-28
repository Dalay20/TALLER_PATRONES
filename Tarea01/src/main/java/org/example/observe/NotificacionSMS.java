package org.example.observe;

public class NotificacionSMS implements ObservadorTarea {

    @Override
    public void actualizar(String nombreTarea) {
        System.out.println("Enviando notificación por SMS para la tarea: " + nombreTarea);
    }
}