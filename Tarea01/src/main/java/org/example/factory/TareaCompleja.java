package org.example.factory;

public class TareaCompleja extends Tarea {

    public TareaCompleja(String nombre, String descripcion, String fechaVencimiento) {
        super(nombre, descripcion, fechaVencimiento);
    }

    @Override
    public void mostrar() {
        System.out.println("Tarea Compleja: " + nombre + " - " + descripcion + " - " + fechaVencimiento);
    }
}