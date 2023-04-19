public class Estudiante {
    private String Nombre; 
    private int codigo;
    private Preguntas preguntas;
    public Estudiante(String nombre, int codigo) {
        this.Nombre = nombre;
        this.codigo = codigo;

    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Preguntas getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(Preguntas preguntas) {
        this.preguntas = preguntas;
    }
    public String toString() {
        return "Nombre: " + this.Nombre + ", Numero: " + this.codigo;
    }
    
}
