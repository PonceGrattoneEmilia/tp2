public class Universidad {
    // Atributos
    private String nombre;
    private String direccion;
    private Estudiante[] estudiantes;

    public Universidad (String nombre, String direccion, int cantidadAlumnos) {
        setNombre(nombre);
        setDireccion(direccion);
        this.estudiantes = new Estudiante[cantidadAlumnos]; // estudiantes va a ser un nuevo listado del tamaño ingresado
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion=direccion;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDireccion () {
        return direccion;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes; // toda la lista
    }

    

    

}
