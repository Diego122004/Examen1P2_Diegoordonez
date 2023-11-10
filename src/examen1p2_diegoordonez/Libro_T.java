
package examen1p2_diegoordonez;


public class Libro_T extends Libro{
    
    private int Curso;
    private String Facu;

    public Libro_T() {
    }

    public Libro_T(int Curso, String Facu) {
        this.Curso = Curso;
        this.Facu = Facu;
    }

    public Libro_T(int Curso, String Facu, String Titulo, String Autor, double Precio, int Edicion) {
        super(Titulo, Autor, Precio, Edicion);
        this.Curso = Curso;
        this.Facu = Facu;
    }

    public int getCurso() {
        return Curso;
    }

    public void setCurso(int Curso) {
        this.Curso = Curso;
    }

    public String getFacu() {
        return Facu;
    }

    public void setFacu(String Facu) {
        this.Facu = Facu;
    }

    @Override
    public String toString() {
        return "Libro_T{" + "Curso=" + Curso + ", Facu=" + Facu + '}';
    }
    
    
    
}
