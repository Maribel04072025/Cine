/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aunonoma.proyectocine.models;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    private final int numeroVenta;
    private final List<Boleta> boletas;
    private final Pelicula pelicula;
    private double total;

    public Venta(int numeroVenta, Pelicula pelicula) {
        this.numeroVenta = numeroVenta;
        this.pelicula = pelicula;
        this.boletas = new ArrayList<>();
        this.total = 0.0;
    }

    public void generarTotal() {
        total = 0.0;
        for (Boleta b : boletas) {
            total += b.getPrecio();
        }
    }

    public void mostrarResumen() {
        System.out.println("Venta #" + numeroVenta);
        System.out.println("Película: " + pelicula.getTitulo());
        System.out.println("Boletas vendidas: " + boletas.size());
        System.out.println("Total: $" + total);
    }

    public void generaBoleta() {
        // Generamos una boleta genérica con precio fijo (puedes modificar)
        Boleta b = new Boleta("Sala 1", 50.0); 
        boletas.add(b);
        generarTotal();
    }

    // Getters
    public double getTotal() {
        return total;
    }

    public List<Boleta> getBoletas() {
        return boletas;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public int getNumeroVenta() {
        return numeroVenta;
    }
}
