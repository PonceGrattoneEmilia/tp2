public class Estudiante extends Persona {
    // Atributos
    private String carrera;
    private float promedio;
    private Materia[] materias;

    // Contructores
    public Estudiante () {   
        super();
    }

    public Estudiante (String nombre, String apellido, int edad, String carrera, float promedio, int cantMaterias, String documento) {
        super (nombre, apellido, edad, documento);
        setCarrera(carrera);
        setPromedio(promedio);
        setMaterias(cantMaterias);
    }

    // Getters
    public String getCarrera(){
        return carrera;
    }

    public float getPromedio(){
        return promedio;
    }

    public Materia[] getMateria(){
        return materias;
    }

    // Setters
    public void setPromedio (float promedio) {
        if (promedio<0 || promedio>10) {
            System.out.println("Error: Promedio Inválido");
        } else {
            this.promedio=promedio;
        }
    }

    public void setCarrera (String carrera) {
        this.carrera=carrera;
    }

    public void setMaterias (int cantMaterias){
        this.materias = new Materia[cantMaterias]; // crea el arreglo con la cantidad de materias ingresada
    }

    // otros metodos
    public void agregarMateria(Materia materiaNueva){
        for(int i=0; i<materias.length; i++) {
            if (materias[i]==null) {
                materias[i]=materiaNueva;
                return;
            }
        }
        System.out.println("No hay espacio para agregar materias.");
    }

    public float calcularPromedio(){
        
        float promedio=0; // calculo el promedio al final
        int cantMaterias=0; // voy contando cuantas materias existen con notas

        for (int i=0; i<materias.length; i++){
            if (materias[i]!=null) {
                promedio+=materias[i].getCalificacion();
                cantMaterias++;
            }
        }

        if(cantMaterias!=0){
            this.promedio=promedio/cantMaterias;
            return this.promedio;
        } else {
            System.out.println("No hay calificaciones para calcular el promedio.");
        }
        return 0;
    }


}
