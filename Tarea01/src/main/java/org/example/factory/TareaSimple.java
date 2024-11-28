package org.example.factory;

public class TareaSimple extends Tarea {

    public TareaSimple(String nombre, String descripcion, String fechaVencimiento) {
        super(nombre, descripcion, fechaVencimiento);
    }

    @Override
    public void mostrar() {
        System.out.println("Tarea Simple: " + nombre + " - " + descripcion + " - " + fechaVencimiento);
    }
}