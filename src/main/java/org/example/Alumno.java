package org.example;

public class Alumno extends Usuario {
    private double[] notas;

    public Alumno(String nombre, int edad, double[] notas) {
        super(nombre, edad);
        this.notas = notas;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    public boolean estaAprobado() {
        return calcularPromedio() >= 7;
    }

    // Método único en Alumno
    public String obtenerEstadoAcademico() {
        return estaAprobado() ? "Aprobado" : "Reprobado";
}

}
