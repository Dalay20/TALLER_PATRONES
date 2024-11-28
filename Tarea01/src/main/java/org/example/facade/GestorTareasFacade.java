package org.example.facade;
import org.example.factory.Tarea;
import org.example.factory.FabricaTareas;
import org.example.strategy.EstrategiaVistaTareas;
import org.example.observe.NotificadorTarea;

public class GestorTareasFacade {
    private FabricaTareas fabricaTareas;
    private EstrategiaVistaTareas estrategiaVista;
    private NotificadorTarea notificadorTarea;

    public GestorTareasFacade(FabricaTareas fabricaTareas, EstrategiaVistaTareas estrategiaVista, NotificadorTarea notificadorTarea) {
        this.fabricaTareas = fabricaTareas;
        this.estrategiaVista = estrategiaVista;
        this.notificadorTarea = notificadorTarea;
    }

    public Tarea crearTarea(String tipo, String nombre, String descripcion, String fechaVencimiento) {
        return fabricaTareas.crearTarea(tipo, nombre, descripcion, fechaVencimiento);
    }

    public void mostrarTareas() {
        estrategiaVista.mostrar();
    }

    public void enviarNotificacion(String nombreTarea) {
        notificadorTarea.enviarNotificacion(nombreTarea);
    }
}
