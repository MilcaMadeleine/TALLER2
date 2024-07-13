package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                // Crear un alumno con nombre, edad y notas
                double[] notas = {6.5, 6.0, 5.5};
                Alumno alumno = new Alumno("George", 20, notas);

                // Crear un profesor con nombre, edad y faltas
                Profesor profesor = new Profesor("Juan Jose Pesantez", 36, 2);

                // Calcular y mostrar el promedio del alumno
                System.out.println("Promedio del alumno: " + alumno.calcularPromedio());

                // Verificar si el alumno está aprobado o reprobado
                System.out.println("Estado del alumno: " + alumno.obtenerEstadoAcademico());

                // Verificar las faltas del profesor
                System.out.println( "Faltas del Profesor: " + profesor.verificarFaltas());

                 // Metodo unico profesor AsignarCalificacion

                // Asignar nuevas notas al alumno
                double[] nuevasNotas = {9.5, 8.7, 10.0};

                // Actualizar calificaciones del alumno
                String AsignarCalificacion= profesor.asignarCalificacion(alumno, nuevasNotas);

                // Imprimir mensaje de confirmación
                System.out.println(AsignarCalificacion);
            }
        }

