/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libros;

/**
 *
 * @author Diego Leon Mora
 * •	Título: Alice in Wonderland, Autor: Lewis Carroll | Free Boo.
 * Página: 320, Calificación: 8 
 * •	Título: El método Lean Startup, Autor: Eric
 * Ries, Páginas: 700, Calificación: 7 *
 */
public class PruebaLibros {

    public static void main(String[] args) {
        ConjuntoLibros p = new ConjuntoLibros();
        Libro primerlibro = new Libro("Alice in Wonderland", "Lewis Carroll, Free Boo ", 320, 8);
        Libro segundoLirbo = new Libro("El método Lean Startup", "Eric Ries ", 700, 7);

        p.AgregarLibro(primerlibro);
        p.AgregarLibro(segundoLirbo);
        System.out.println("Estos son todos los libros creados");
        p.ImprimirLibros();
        System.out.println("Estos son los de calificacion mayor y menor respectivamente");
        p.calificacion();
        p.CambiarCalificacion("El método Lean Startup", 8);
        p.ImprimirLibros();
        p.AgregarLibro(primerlibro);
        p.ImprimirLibros();
       
      

    }

}
