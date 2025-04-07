package autonoma.proyectocine.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import autonoma.proyectocine.models.Pelicula;
import autonoma.proyectocine.models.Venta;

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

    public Pelicula elegirPeliculas(List<Pelicula> peliculas, Scanner entrada) {
        System.out.println("Lista de películas:");
        int contador = 1;
        for (Pelicula p : peliculas) {
            System.out.println("Película número " + contador);
            System.out.println("Título: " + p.getTitulo());
            System.out.println("Precio base: " + p.getCostoBase());
            System.out.println("-------------------------");
            contador++;
        }

        System.out.println("\n=== Ingrese el número de la película de tu interés ===");
        int op = entrada.nextInt();
        entrada.nextLine(); // limpiar buffer

        if (op >= 1 && op <= peliculas.size()) {
            System.out.println("Disfrute la película");
            return peliculas.get(op - 1); // las listas empiezan en 0
        } else {
            System.out.println("Número incorrecto");
            return null;
        }
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void vender(Venta nuevaVenta, Scanner entrada) {
            nuevaVenta.generaBoleta(entrada);
        nuevaVenta.generarTotal();
        nuevaVenta.mostrarResumen();
        this.ventas.add(nuevaVenta);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cine cine = new Cine();

        // Crear películas
        Pelicula p1 = new Pelicula("Matrix", 20000);
        Pelicula p2 = new Pelicula("Titanic", 30000);

        // Agregar películas
        cine.agregarPelicula(p1);
        cine.agregarPelicula(p2);

        // Elegir película
        Pelicula peliculaDeseada = cine.elegirPeliculas(cine.getPeliculas(), entrada);

        if (peliculaDeseada != null) {
            // Crear venta
            Venta v1 = new Venta(3, peliculaDeseada);

            // Realizar venta
            cine.vender(v1, entrada);
        } else {
            System.out.println("No se pudo realizar la venta por selección inválida.");
        }

        entrada.close(); // ✅ cerrar al final del programa
    }
}
