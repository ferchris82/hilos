package org.chrisferdev.hilos.ejemplos;

import org.chrisferdev.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnable {
    public static void main(String[] args) {

        new Thread(new ViajeTarea("Isla de Pascua")).start();
        new Thread(new ViajeTarea("Robinson Crusoe")).start();
        new Thread(new ViajeTarea("Juan Fernandez")).start();
        new Thread(new ViajeTarea("Isla de Chiloe")).start();
    }
}
