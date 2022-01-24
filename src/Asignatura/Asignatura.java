
package Asignatura;



public class Asignatura {
    //Atributos
    private String nombre;
    private int horas;

    //Constructores
    public Asignatura(String nombre, int horas){
        this.nombre = nombre;
        if(!comprobarInt(horas)){
            throw new IllegalArgumentException("Las horas no pueden ser menor a 1.");
        }
        this.horas = horas;
    }
    
    public Asignatura(Asignatura a){
        this.nombre = a.nombre;
        this.horas = a.horas;
    }
    
    //Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if(comprobarInt(horas)){
            this.horas = horas;
        }
    }

    public boolean equals(Asignatura a) {
        return this.nombre.equals(a.nombre);
    }
    
    private boolean comprobarInt(int dato){
        if(dato < 1){
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", horas=" + horas + '}';
    }
}
