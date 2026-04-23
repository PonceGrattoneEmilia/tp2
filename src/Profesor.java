public class Profesor extends Persona {
    private String especialidad;
    private int añosExperiencia;
    private Materia[] materiasAsignadas;

    public Profesor () {
        super();
    }

    public Profesor (String nombre, String apellido, int edad, String documento, String especialidad, int añosExperiencia, int cantMaterias) {
        super(nombre, apellido, edad, documento);
        setEspecialidad(especialidad);
        setAñosExperiencia(añosExperiencia);
        setMateriasAsignadas(cantMaterias);
    }

    public void setEspecialidad (String especialidad) {
        this.especialidad=especialidad;
    }

    public void setAñosExperiencia (int años) {
        this.añosExperiencia=años;
    }

    public void setMateriasAsignadas (int cantidad) {
        this.materiasAsignadas = new Materia[cantidad];
    }

    public String getEspecialidad () {
        return especialidad;
    }

    public int getAñosExperiencia () {
        return añosExperiencia;
    }

    public Materia[] getMateriasAsignadas () {
        return materiasAsignadas;
    }

    public void asignarMateria (Materia nueva) {
        for (int i=0; i<materiasAsignadas.length; i++) {
            if(materiasAsignadas[i]==null) {
                this.materiasAsignadas[i]=nueva;
                return;
            }
        }
        System.out.println("No hay espacio para asignar otra materia.\n");
    }

}
