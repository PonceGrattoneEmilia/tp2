public class Materia {
    // atributos
    private String nombre;
    private String codigo;
    private int creditos;
    private float calificacion;
    private Profesor profesor;

    // constructor
    public Materia (String nombre, String codigo, int creditos, float calificacion) {
        setNombre(nombre);
        setCodigo(codigo);
        setCreditos(creditos);
        setCalificacion(calificacion);
    }

    // getters
    public String getNombre(){
        return nombre;
    }

    public String getCodigo(){
        return codigo;
    }

    public int getCreditos(){
        return creditos;
    }

    public float getCalificacion(){
        return calificacion;
    }

    // setters

    public void setNombre (String nombre) {
        this.nombre=nombre;
    }

    public void setCodigo (String codigo) {
        this.codigo=codigo;
    }

    public void setCreditos (int creditos) {
        this.creditos=creditos;
    }

    public void setCalificacion (float calificacion) {
        this.calificacion=calificacion;
    }

}