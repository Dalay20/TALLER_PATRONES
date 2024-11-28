package org.example.strategy;

public class EstrategiaVistaLista implements EstrategiaVistaTareas {

    @Override
    public void mostrar() {
        System.out.println("Mostrando tareas en vista de lista");
    }
}