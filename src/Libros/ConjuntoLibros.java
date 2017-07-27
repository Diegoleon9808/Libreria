/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gamer
 */
public class ConjuntoLibros {

    ArrayList<Libro> Estanteria = new ArrayList();

    public void Info() {
        Scanner leer = new Scanner(System.in);
        String Titulo = leer.nextLine();
        String Autor = leer.nextLine();
        int NumPags = leer.nextInt();
        int Calificacion = leer.nextInt();

        Libro libro = new Libro(Titulo, Autor, NumPags, Calificacion);

        AgregarLibro(libro);
    }

    public void AgregarLibro(Libro libro) {

        if (buscar(libro)) {
            if (Verificacion()) {

                Estanteria.add(libro);
            } else {
                System.out.println("El espacio de la estanteria esta lleno");
            }
        }

    }

    public boolean Verificacion() {

        if (this.Estanteria.size() >= 10) {
            return false;
        } else {
            return true;
        }
    }

    public void ImprimirLibros() {
        for (int i = 0; i < Estanteria.size(); i++) {
            System.out.println(Estanteria.get(i));
        }
    }

    public boolean buscar(Libro libro) {

        for (int i = 0; i < Estanteria.size(); i++) {
            if (Estanteria.get(i).getTitulo() == libro.getTitulo()) {
                System.out.println("El libro ya esta en la estanteria");
                return false;
            }

        }

        return true;

    }

    public void calificacion() {
        int NumMayor = 0;
        int PosMayor = 0;
        int NumMenor = 10;
        int PosMenor = 0;
        for (int i = 0; i < Estanteria.size(); i++) {
            if (Estanteria.get(i).getCalificacion() > NumMayor) {
                NumMayor = Estanteria.get(i).getCalificacion();
                PosMayor = i;
            }
        }

        for (int i = 0; i < Estanteria.size(); i++) {
            if (Estanteria.get(i).getCalificacion() < NumMenor) {
                NumMenor = Estanteria.get(i).getCalificacion();
                PosMenor = i;

            }

        }

        System.out.println(Estanteria.get(PosMayor));
        System.out.println(Estanteria.get(PosMenor));

    }

    public void CambiarCalificacion(String titulo, int NuevaCalificacion) {

        for (int i = 0; i < Estanteria.size(); i++) {
            if (Estanteria.get(i).getTitulo() == titulo) {
                Estanteria.get(i).setCalificacion(NuevaCalificacion);
                break;
            } else {

            }

        }
    }
}
