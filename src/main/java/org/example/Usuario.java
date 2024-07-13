package org.example;

public class Usuario {
    private String nombre;
    private int edad;

    public Usuario(String nombre, int edad) {
        // Validar entrada
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad debe ser un valor positivo");
        }

        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Se cambia el modificador de acceso a 'protected'
    protected void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

