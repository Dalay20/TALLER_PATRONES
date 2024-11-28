package org.example.factory;

public class FabricaTareaCompleja implements FabricaTareas {

    @Override
    public Tarea crearTarea(String tipo,String nombre, String descripcion, String fechaVencimiento) {
     if (tipo.equals("Simple")) {
        return new TareaCompleja(nombre, descripcion, fechaVencimiento);
      }
        return null;
     }
}

