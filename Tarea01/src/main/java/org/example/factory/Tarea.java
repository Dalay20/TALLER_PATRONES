package org.example.factory;

public abstract class Tarea {
    protected String nombre;
    protected String descripcion;
    protected String fechaVencimiento;

    public Tarea(String nombre, String descripcion, String fechaVencimiento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaVencimiento = fechaVencimiento;
    }

    public abstract void mostrar();
}
