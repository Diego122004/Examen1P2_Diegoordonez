/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_diegoordonez;

public class Libro {

    protected String Titulo;
    protected String Autor;
    protected double Precio;
    protected int Edicion;

    public Libro() {
    }

    public Libro(String Titulo, String Autor, double Precio) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Precio = Precio;

    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getEdicion() {
        return Edicion;
    }

    public void setEdicion(int Edicion) {
        this.Edicion = Edicion;
    }

    @Override
    public String toString() {
        return "Título: " + Titulo + "\n"
                + "Autor: " + Autor + "\n"
                + "Libro\n"
                + "Edición: " + Edicion + "\n"
                + "Precio: $" + Precio;
    }

}
