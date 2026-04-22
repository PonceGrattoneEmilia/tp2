public class Carrera {
    // atributos
    private String nombre;
    private Estudiante[] estudiantes;

    //constructores
    public Carrera (String nombre, int cupos) {
        setNombre(nombre);
        setEstudiantes(cupos);
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes; // devuelve la cantidad 
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public void setEstudiantes(int cupos) {
        this.estudiantes= new Estudiante[cupos]; //crea el arreglo con la cantidad de elementos (cupos de estudiantes) que se ingresaron
    }

    // otros metodos
    public void listarEstudiantes () {
        boolean hayEstudiantes= false;
        for (int i=0; i<estudiantes.length; i++) {
            if (estudiantes[i]!=null) {
                System.out.println("- Nombre: " + estudiantes[i].getNombre() + " - Apellido: " + estudiantes[i].getApellido());
                hayEstudiantes=true;
            }
        }
        if(hayEstudiantes==false) {
        System.out.println("No hay alumnos inscriptos en la materia.");
        }
    }

    public void agregarEstudiante( Estudiante estudianteNuevo) {
        for (int i=0; i<estudiantes.length; i++) {
            if(estudiantes[i]==null) {
                estudiantes[i]=estudianteNuevo;
                return;
            }
        }
        System.out.println("No hay espacio para alumnos nuevos.");
    }

    public void buscarAlumnos(String Nombre) {
        boolean variable=false;
        for(int i=0; i<estudiantes.length; i++) {
            if(estudiantes[i]!=null && estudiantes[i].getNombre().equalsIgnoreCase(Nombre)) {
                System.out.println("Estudiante encontrado --> Nombre: " + Nombre + " Apellido: " + estudiantes[i].getApellido() + "Promedio: " + estudiantes[i].getPromedio());
                variable=true;
            }
        }
        if(variable==false){
        System.out.println("No fue encontrado un alumno con el nombre: " + Nombre);
        }
    }

    public Estudiante obtenerEstudiante (String objetivo) {
        for (int i=0; i<estudiantes.length; i++) {
            if (estudiantes[i]!= null && estudiantes[i].getNombre().equalsIgnoreCase(objetivo)) {
                return estudiantes[i]; // se ecnontró y devuelve el alumno
            }
        }
        return null; // no se encontró el alumno
    }

}
