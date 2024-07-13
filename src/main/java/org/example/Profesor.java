package org.example;

public class Profesor extends Usuario {
    private int faltas;

    public Profesor(String nombre, int edad, int faltas) {
        super(nombre, edad);
        this.faltas = faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getFaltas() {
        return faltas;
    }

    protected String verificarFaltas() {
        int faltasRestantes = 3 - faltas;
        if (faltas > 3) {
            return "Ha superado el límite de faltas. Debe justificar las faltas enviando un correo.";
        } else if (faltasRestantes == 1) {
            return "Le queda una falta para llegar al límite.";
        } else if (faltasRestantes > 1) {
            return "Le quedan " + faltasRestantes + " faltas para llegar al límite.";
        } else {
            return "Faltas dentro del límite permitido.";
        }
    }

    // Método único en Profesor AsignarCalificacion

    // El método asignarCalificacion en la clase Profesor tiene como objetivo actualizar las notas del alumno con las nuevas notas proporcionadas por el profesor. Este método recibe dos parámetros:
    //alumno: Un objeto de la clase Alumno que representa al alumno al que se le asignarán las nuevas notas.
    //nuevasNotas: Un array de tipo double que contiene las nuevas notas del alumno.

    public String asignarCalificacion(Alumno alumno, double[] nuevasNotas) {
      alumno.setNotas(nuevasNotas);
        return "Calificaciones Asignadas.";
    }

    @Override
    protected void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método de la clase base
        System.out.println("Faltas: " + faltas);
    }
}
