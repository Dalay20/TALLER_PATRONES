package org.example.observe;

public class NotificacionCorreo implements ObservadorTarea {

    @Override
    public void actualizar(String nombreTarea) {
        System.out.println("Enviando notificación por correo electrónico para la tarea: " + nombreTarea);
    }
}
