
package start;

import facade.TaskManagerFacade;
import factory.SimpleTaskFactory;
import strategy.ListViewStrategy;
import observer.EmailNotification;
import observer.TaskNotifier;

public class Main {

    public static void main(String[] args) {
        // Configuración de la fachada
        TaskNotifier notifier = new TaskNotifier();
        notifier.addObserver(new EmailNotification());

        TaskManagerFacade facade = new TaskManagerFacade( new SimpleTaskFactory(),new ListViewStrategy(),notifier );

        // Crear tareas
        facade.createTask("Simple", "Tarea 1", "Descripción", "2024-11-30");
        facade.createTask("Complex", "Tarea 2", "Descripción Compleja", "2024-12-05");

        // Mostrar tareas
        facade.displayTasks();

        // Enviar notificación
        facade.sendNotification("Tarea 1");
    }


}