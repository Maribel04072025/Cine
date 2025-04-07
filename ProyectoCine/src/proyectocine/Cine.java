/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectocine;

/**
 *
 * @author marib
 */


import java.util.ArrayList;
import java.util.List;

public class Cine {
    private List<Pelicula> peliculas;
    private List<Venta> ventas;

    public Cine() {
        peliculas = new ArrayList<>();
        ventas = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula p) {
        peliculas.add(p);
    }

    public void eliminarPelicula(Pelicula p) {
        peliculas.remove(p);
    }

    public List<Pelicula> mostrarPeliculas() {
        return peliculas;
    }

    public void vender(List<Venta> ventas, List<Pelicula> peliculas) {
        this.ventas.addAll(ventas);
        this.peliculas.removeAll(peliculas);
    }

    public static void main(String[] args) {
        Cine cine = new Cine();

        // Crear películas
        Pelicula p1 = new Pelicula("Matrix", "Ciencia ficción");
        Pelicula p2 = new Pelicula("Titanic", "Romance");

        // Agregar películas
        cine.agregarPelicula(p1);
        cine.agregarPelicula(p2);

        // Mostrar películas disponibles
        System.out.println("Películas disponibles:");
        for (Pelicula p : cine.mostrarPeliculas()) {
            System.out.println(p.getTitulo() + " - " + p.getGenero());
        }

        // Crear venta
        Venta v1 = new Venta(p1, 3);
        List<Venta> listaVentas = new ArrayList<>();
        listaVentas.add(v1);

        List<Pelicula> peliculasVendidas = new ArrayList<>();
        peliculasVendidas.add(p1);

        // Realizar venta
        cine.vender(listaVentas, peliculasVendidas);

        // Mostrar películas después de la venta
        System.out.println("\nPelículas después de la venta:");
        for (Pelicula p : cine.mostrarPeliculas()) {
            System.out.println(p.getTitulo() + " - " + p.getGenero());
        }
    }
}
