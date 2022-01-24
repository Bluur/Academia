
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
        this.listaAsignaturas = new Asignatura[1];
    }
    
    public Estudiante(Estudiante e){
        this.nombre = e.nombre;
        this.apellido1 = e.apellido1;
        this.apellido2 = e.apellido2;
        this.listaAsignaturas = Arrays.copyOf(e.listaAsignaturas, e.listaAsignaturas.length);
    }
    
    //Métodos
    public boolean añadeAsignaturas(Asignatura a){
        if(horasTotales == 0){
            this.listaAsignaturas[0] = a;
            horasTotales += a.getHoras();
            aumentarAsignaturas();
            return true;
        }else if(horasTotales + a.getHoras() <= 30){
            this.listaAsignaturas = Arrays.copyOf(listaAsignaturas, listaAsignaturas.length+1);
            this.listaAsignaturas[listaAsignaturas.length-1] = a;
            horasTotales += a.getHoras();
            aumentarAsignaturas();
            return true;
        }else{
            String mensaje = "No se ha podido añadir %s por falta de horas disponibles".formatted(a.getNombre());
            System.out.println(mensaje);
            return false;
        }
    }
    
    private void aumentarAsignaturas(){
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
