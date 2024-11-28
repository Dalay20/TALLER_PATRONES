package org.example.factory;

public interface FabricaTareas {
    Tarea crearTarea(String tipo, String nombre, String descripcion, String fechaVencimiento);
}
