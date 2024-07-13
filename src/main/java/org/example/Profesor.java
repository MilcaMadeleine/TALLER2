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

    // Método único en Profesor
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
