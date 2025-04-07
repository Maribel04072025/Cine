package autonoma.proyectocine.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase que representa una venta de boletas de una película.
 * Administra la información relacionada con la película vendida,
 * las boletas generadas, el número de venta y el cálculo del total.
 * 
 * @author  Maribel Ceballos <maribel.ceballosc@autonoma.edu.com>
 * @version 1.0
 * @since   2025/04/07
 */
public class Venta {
    private final int numeroVenta;
    private final List<Boleta> boletas;
    private final Pelicula pelicula;
    private double total;

    /**
     * Constructor para crear una venta con su número e información de la película.
     * 
     * @param numeroVenta Número identificador de la venta.
     * @param pelicula Objeto {@code Pelicula} asociado a la venta.
     */
    public Venta(int numeroVenta, Pelicula pelicula) {
        this.numeroVenta = numeroVenta;
        this.pelicula = pelicula;
        this.boletas = new ArrayList<>();
        this.total = 0.0;
    }

    /**
     * Calcula el total de la venta sumando el precio final de cada boleta.
     */
    public void generarTotal() {
        total = 0.0;
        for (Boleta b : boletas) {
            total += b.getPrecioFinal();
        }
        this.total = total;
    }

    /**
     * Muestra un resumen de la venta, incluyendo el número de venta,
     * el nombre de la película, la cantidad de boletas y el total recaudado.
     */
    public void mostrarResumen() {
        System.out.println("Venta #" + numeroVenta);
        System.out.println("Película: " + pelicula.getTitulo());
        System.out.println("Boletas vendidas: " + boletas.size());
        System.out.println("Total: $" + this.total);
    }

    /**
     * Genera las boletas solicitadas por el usuario. 
     * Solicita el tipo de función y la cantidad de boletas,
     * luego pide el tipo de usuario para cada boleta, calcula el precio
     * y la agrega a la lista.
     * 
     * @param entrada Objeto Scanner para la entrada por teclado.
     */
    public void generaBoleta(Scanner entrada) {
        this.pelicula.tipoFuncion(entrada);

        System.out.println("¿Cuántas boletas desea?");
        int numeroBoletas = entrada.nextInt();
        entrada.nextLine(); // limpiar buffer

        for (int i = 1; i <= numeroBoletas; i++) {
            Boleta b = new Boleta(i, this.pelicula);
            b.tipoUsuario(entrada);
            b.calcularPrecioBoleta();
            boletas.add(b);
        }
        generarTotal();
    }

    // Getters

    /**
     * Devuelve el total de la venta.
     * 
     * @return Total recaudado.
     */
    public double getTotal() {
        return total;
    }

    /**
     * Devuelve la lista de boletas asociadas a la venta.
     * 
     * @return Lista de objetos {@code Boleta}.
     */
    public List<Boleta> getBoletas() {
        return boletas;
    }

    /**
     * Devuelve la película asociada a la venta.
     * 
     * @return Objeto {@code Pelicula}.
     */
    public Pelicula getPelicula() {
        return pelicula;
    }

    /**
     * Devuelve el número identificador de la venta.
     * 
     * @return Número de venta.
     */
    public int getNumeroVenta() {
        return numeroVenta;
    }
}