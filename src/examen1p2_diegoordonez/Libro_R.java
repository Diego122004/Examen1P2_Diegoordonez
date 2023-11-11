/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_diegoordonez;


public class Libro_R extends Libro{
    private String TipoL;

    public Libro_R() {
    }

    public Libro_R(String TipoL) {
        this.TipoL = TipoL;
    }

    public Libro_R(String TipoL, String Titulo, String Autor, double Precio) {
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
        return "Libro_R{" + "TipoL=" + TipoL + '}';
    }
    
    
}
