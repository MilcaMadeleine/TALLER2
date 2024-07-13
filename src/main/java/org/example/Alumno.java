package org.example;

public class Alumno extends Usuario {
    private double[] notas;

    public Alumno(String nombre, int edad, double[] notas) {
        super(nombre, edad);
        this.notas = notas;
    }
// Getter y Setters


    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    // Método único en Alumno
    public String obtenerEstadoAcademico() {
        return estaAprobado() ? "Aprobado" : "Reprobado";
    }

    public boolean estaAprobado() {
        return calcularPromedio() >= 7;
    }

    // Se redefinen el método mostrando información específica del alumno
    @Override
    protected void mostrarInformacion() {
        super.mostrarInformacion(); // Llamada al método de la clase padre
        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("Estado académico: " + obtenerEstadoAcademico());
    }
}

