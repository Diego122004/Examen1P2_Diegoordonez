
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

    public Libro_T(int Curso, String Facu, String Titulo, String Autor, double Precio) {
        super(Titulo, Autor, Precio);
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
        return super.toString();
    }
    
    
    
}
