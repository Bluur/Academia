
package Estudiante;

import Asignatura.Asignatura;
import java.util.Arrays;

public class Estudiante {
    //Atributos
    private String nombre;
    private String apellido1;
    private String apellido2;
    
    private Asignatura listaAsignaturas[];
    private int numeroAsignaturas;
    private int horasTotales;
    
    //Contructores
    public Estudiante(String nombre, String apellido1, String apellido2){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }
    
    public Estudiante(Estudiante e){
        this.nombre = e.nombre;
        this.apellido1 = e.apellido1;
        this.apellido2 = e.apellido2;
    }
    
    //Métodos
    public boolean añadeAsignaturas(Asignatura a){
        if(this.listaAsignaturas == null){
            this.listaAsignaturas = new Asignatura[1];
            this.listaAsignaturas[0] = new Asignatura(a);
            aumentarAsignaturas();
            this.horasTotales += a.getHoras();
            return true;
        }
        else if(a.getHoras() + horasTotales <= 30){
            int suma = this.listaAsignaturas.length+1;
            this.listaAsignaturas = Arrays.copyOf(listaAsignaturas, suma);
            this.listaAsignaturas[listaAsignaturas.length-1] = a;
            aumentarAsignaturas();
            this.horasTotales += a.getHoras();
            return true;
        }
        else{
            String nombreAsignatura = a.getNombre();
            String variable = "No se ha podido añadir %s por excedimiento de horas semanales.".formatted(nombreAsignatura);
            System.out.println(variable);
            return false;
        }
    }
    
    public void aumentarAsignaturas(){
        this.numeroAsignaturas++;
    }

    public int getHorasTotales(){
        return this.horasTotales;
    }
    
    public int getNumeroAsignaturasMatriculadas(){
        return this.numeroAsignaturas;
    }
    
    public Asignatura getAsignatura(int posicion){
        return listaAsignaturas[posicion];
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    
    public void setAsignatura(Asignatura a, int posicion){
        this.listaAsignaturas[posicion] = new Asignatura(a);
    }

    @Override
    public String toString() {
        return "Estudiante{" + "\nnombre=" + nombre + " \napellido1=" + apellido1 + " \napellido2=" + apellido2 + " \nlistaAsignaturas=" + Arrays.toString(listaAsignaturas) + '}';
    }

    public boolean equals(Estudiante b) {
        return this.nombre.equals(b.nombre);
    }

    
    
}
