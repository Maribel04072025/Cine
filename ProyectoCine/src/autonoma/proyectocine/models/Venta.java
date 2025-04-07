package autonoma.proyectocine.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
            total += b.getPrecioFinal();
        }
        this.total = total;
    }

    public void mostrarResumen() {
        System.out.println("Venta #" + numeroVenta);
        System.out.println("Película: " + pelicula.getTitulo());
        System.out.println("Boletas vendidas: " + boletas.size());
        System.out.println("Total: $" + this.total);
    }

    // Scanner se pasa como parámetro
    public void generaBoleta(Scanner entrada) {
        this.pelicula.tipoFuncion(entrada); // método de la película

        System.out.println("¿Cuántas boletas desea?");
        int numeroBoletas = entrada.nextInt();
        entrada.nextLine(); // limpiar buffer

        for (int i = 1; i <= numeroBoletas; i++) {
            Boleta b = new Boleta(i, this.pelicula);
            b.tipoUsuario(entrada);
            b.calcularPrecioBoleta();
            
            boletas.add(b);
        }
        generarTotal(); // solo una vez
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
