package com.tareas;

public class MostrarTareas {
    public void listarTareas(GestorTareas gestor) {
        System.out.println("\nLista de tareas:");
        for (String tarea : gestor.getTareas()) {
            System.out.println("- " + tarea);
        }
    }
}
