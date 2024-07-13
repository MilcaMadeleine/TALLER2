package org.example;

public class Profesor extends Usuario {
    private int faltas;

    public Profesor(String nombre, int edad, int faltas) {
        super(nombre, edad);
        this.faltas = faltas;
    }

    public int getFaltas() {
        return faltas;
    }

    public String verificarFaltas() {
        if (faltas > 3) {
            return "Debe justificar las faltas enviando un correo.";
        } else {
            return "Faltas dentro del límite permitido.";
        }
    }
    // Método único en Profesor
    public String asignarCalificacion(Alumno alumno, double[] nuevasNotas) {
        alumno = new Alumno(alumno.getNombre(), alumno.getEdad(), nuevasNotas);
        return "Calificaciones Asignadas.";
}

}