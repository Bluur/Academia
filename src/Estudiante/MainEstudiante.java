
package Estudiante;

import Asignatura.Asignatura;

public class MainEstudiante {

    public static void main(String[] args) {
        //Creamos los objetos estudiantes
        Estudiante Miguel = new Estudiante("Miguel", "Garcia del Real", "Ortiz");
        Estudiante random = new Estudiante("Miguel", "hapillado", "elcovid");
        
        //Creamos los objetos asignaturas que queremos añadir
        Asignatura bbdd = new Asignatura("Bases de Datos", 6);
        Asignatura programacion = new Asignatura("Programación", 8);
        Asignatura lenguajes = new Asignatura("Lenguajes de Marcas", 4);
        Asignatura entornos = new Asignatura("Entornos de Desarrollo", 3);
        Asignatura fol = new Asignatura("Formación y Orientación laboral", 3);
        Asignatura si = new Asignatura("Sistemas Informáticos", 6);
        
        //Esta no la va a añadir por exceder el cupo de horas semanales
        Asignatura administracion = new Asignatura("administración", 2);
        
        //Añade las asignaturas al objeto de la clase estudiante
        Miguel.añadeAsignaturas(bbdd);
        Miguel.añadeAsignaturas(programacion);
        Miguel.añadeAsignaturas(lenguajes);
        Miguel.añadeAsignaturas(entornos);
        Miguel.añadeAsignaturas(fol);
        Miguel.añadeAsignaturas(si);
        Miguel.añadeAsignaturas(administracion);
        
        //Comprueba los nombres de ambos objetos
        if(Miguel.equals(random)){
            System.out.println("Son iguales");
        }
        
        System.out.println("");
        
        //Saca por pantalla el objeto
        //Tengo que buscar una forma de añadir un salto de línea por cada asignatura, creo que tendré que escribir mi propio método toString.
        System.out.println(Miguel);
        
        System.out.println(Miguel.getAsignatura(3));
        
        System.out.println("");
        
        //Creamos otra asignatura, pero al añadirla la cambiamos por otra que halla en el lugar especificado
        Asignatura orientacion = new Asignatura("Orientación Empresarial", 3);
        Miguel.setAsignatura(orientacion, 0);
                
        System.out.println(Miguel);
        System.out.println("%s está matriculado en %s asignaturas".formatted(Miguel.getNombre(), Miguel.getNumeroAsignaturasMatriculadas()));
    }
    
}
