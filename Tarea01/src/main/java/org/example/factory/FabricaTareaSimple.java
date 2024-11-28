package org.example.factory;

public class FabricaTareaSimple implements FabricaTareas {

    @Override
    public Tarea crearTarea(String tipo,String nombre, String descripcion, String fechaVencimiento) {
        if (tipo.equals("Simple")) {
            return new TareaSimple(nombre, descripcion, fechaVencimiento);
        }
        return null;
    }
}
