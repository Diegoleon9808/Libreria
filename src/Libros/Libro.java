/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libros;

/**
 *
 * @author Gamer
 */
public class Libro {

    /**
     * @param args the command line arguments
     */
    private String Titulo;
    private String Autor;
    private int NumPags;
    private int Calificacion;

    public Libro(String Titulo, String Autor, int NumPags, int Calificacion) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPags = NumPags;
        this.Calificacion = Calificacion;
    }

    @Override
    public String toString() {
        return "Libro{" + "Titulo=" + Titulo + ", Autor=" + Autor + ", NumPags=" + NumPags + ", Calificacion=" + Calificacion + '}';
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

    public int getNumPags() {
        return NumPags;
    }

    public void setNumPags(int NumPags) {
        this.NumPags = NumPags;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(int Calificacion) {
        this.Calificacion = Calificacion;
    }

}
