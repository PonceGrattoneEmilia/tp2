public class Persona {
    protected String nombre, apellido, documento;
    protected int edad;

    public Persona () {}

    public Persona (String nombre, String apellido, int edad, String documento) {
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setDocumento(documento);
    }

    public void setNombre(String nombre) {
        if (nombre.trim().isEmpty()){
            System.out.println("Error: Nombre Vacío");
        } else {
            this.nombre=nombre;
        }
    }

    public void setApellido (String apellido) {
        if (apellido.trim().isEmpty()){
            System.out.println("Error: Apellido Vacío");
        } else {
            this.apellido=apellido;
        }
    }

    public void setEdad (int edad) {
        if (edad<=16) {
            System.out.println("Error: La edad debe ser mayor a 16 años.");
        } else {
            this.edad=edad;
        }
    }

    public void setDocumento (String documento) {
        this.documento = documento;
    }

    public String getNombre () {
        return nombre;
    }

    public String getApellido () {
        return apellido;
    }

    public int getEdad () {
        return edad;
    }

    public String getDocumento () {
        return documento;
    }


}
