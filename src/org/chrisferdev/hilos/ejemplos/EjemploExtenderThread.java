package org.chrisferdev.hilos.ejemplos;

import org.chrisferdev.hilos.ejemplos.threads.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {

        Thread hilo = new NombreThread("John Doe");
        hilo.start();
        //Thread.sleep(3);
        Thread hilo2 = new NombreThread("Maria");
        hilo2.start();
        System.out.println(hilo.getState());

        NombreThread hilo3 = new NombreThread("Pepe");
        hilo3.start();
        System.out.println(hilo.getState());
    }
}
