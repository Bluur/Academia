
package Asignatura;

public class MainAsignatura {

    public static void main(String[] args) {
        
        Asignatura si = new Asignatura("Sistemas Informáticos", 6);
        Asignatura lenguajes = new Asignatura(si);
        
        lenguajes.setNombre("Lenguajes de Marcas");
        lenguajes.setHoras(4);
        
        Asignatura programacion = new Asignatura("Programación", 8);
        
        System.out.println(si);
        System.out.println(lenguajes);
        System.out.println(programacion);
    }
    
}
