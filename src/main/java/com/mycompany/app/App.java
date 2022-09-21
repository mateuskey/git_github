package com.mycompany.app;

/**
 * Se cambio el saludo a hola como estas!
 */
public class App
{

    private final String message = "Hola como estas!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
