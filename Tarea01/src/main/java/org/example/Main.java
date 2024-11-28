package org.example;
import org.example.facade.GestorTareasFacade;
import org.example.factory.FabricaTareaSimple;
import org.example.factory.FabricaTareaCompleja;
import org.example.strategy.EstrategiaVistaLista;
import org.example.strategy.EstrategiaVistaTablero;
import org.example.observe.NotificacionCorreo;
import org.example.observe.NotificadorTarea;

public class Main {

        public static void main(String[] args) {
            // Configuración de la fachada
            NotificadorTarea notificador = new NotificadorTarea();
            notificador.agregarObservador(new NotificacionCorreo());

            GestorTareasFacade gestorTareas = new GestorTareasFacade(
                    new FabricaTareaSimple(),
                    new EstrategiaVistaLista(),
                    notificador
            );

            // Crear tareas
            gestorTareas.crearTarea("Simple", "Tarea 1", "Descripción", "2024-11-30");
            gestorTareas.crearTarea("Compleja", "Tarea 2", "Descripción Compleja", "2024-12-05");

            // Mostrar tareas
            gestorTareas.mostrarTareas();
    }
}