public class Personal extends Persona {
    private String departamento, puesto, fechaIngreso;

    public Personal () {
        super();
    }

    public Personal (String departamento, String puesto, String fehcaIngreso, String nombre, int edad, String apellido, String documento) {
        super(nombre, apellido, edad, documento);
        setDepartamento(departamento);
        setPuesto(puesto);
        setFechaIngreso(fechaIngreso);
    }

    public void setDepartamento(String departamento) {
        this.departamento=departamento;
    }

    public void setPuesto(String puesto) {
        this.puesto=puesto;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso=fechaIngreso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }
    
}
