/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_diegoordonez;

/**
 *
 * @author 50432
 */
public class Libro_F extends Libro{
    private String TipoL;

    public Libro_F() {
    }

    public Libro_F(String TipoL) {
        this.TipoL = TipoL;
    }

    public Libro_F(String TipoL, String Titulo, String Autor, double Precio) {
        super(Titulo, Autor, Precio);
        this.TipoL = TipoL;
    }

    public String getTipoL() {
        return TipoL;
    }

    public void setTipoL(String TipoL) {
        this.TipoL = TipoL;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
