package com.tema3;

public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Pepe", "Toño", "Lalo"};
        String concat = "";
        for (String nombre : nombres) {
            concat += " " + nombre;
        }
        System.out.println(concat);
    }
}
