package autonoma.proyectocine.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import autonoma.proyectocine.models.Pelicula;
import autonoma.proyectocine.models.Venta;

/**
 * Clase principal que representa el cine, permitiendo gestionar
 * películas y realizar ventas de boletas.
 * 
 * También contiene el método {@code main} para ejecutar el programa.
 * 
 * @author  Maribel Ceballos <maribel.ceballosc@autonoma.edu.co>
 * @version 1.0
 * @since   2025/04/07
 */
public class Cine {
    private List<Pelicula> peliculas;
    private List<Venta> ventas;

    /**
     * Constructor que inicializa las listas de películas y ventas.
     */
    public Cine() {
        peliculas = new ArrayList<>();
        ventas = new ArrayList<>();
    }

    /**
     * Agrega una nueva película al catálogo.
     * 
     * @param p Película a agregar.
     */
    public void agregarPelicula(Pelicula p) {
        peliculas.add(p);
    }

    /**
     * Elimina una película del catálogo.
     * 
     * @param p Película a eliminar.
     */
    public void eliminarPelicula(Pelicula p) {
        peliculas.remove(p);
    }

    /**
     * Permite al usuario seleccionar una película de la lista mostrada por pantalla.
     * 
     * @param peliculas Lista de películas disponibles.
     * @param entrada Objeto {@code Scanner} para la entrada de datos.
     * @return Película seleccionada o {@code null} si la opción es inválida.
     */
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
            return peliculas.get(op - 1); // las listas comienzan desde 0
        } else {
            System.out.println("Número incorrecto");
            return null;
        }
    }

    /**
     * Devuelve la lista de películas disponibles.
     * 
     * @return Lista de películas.
     */
    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    /**
     * Realiza la venta de una película. Genera boletas, calcula el total,
     * muestra el resumen y guarda la venta.
     * 
     * @param nuevaVenta Venta a procesar.
     * @param entrada Objeto {@code Scanner} para la entrada de datos.
     */
    public void vender(Venta nuevaVenta, Scanner entrada) {
        nuevaVenta.generaBoleta(entrada);
        nuevaVenta.generarTotal();
        nuevaVenta.mostrarResumen();
        this.ventas.add(nuevaVenta);
    }

    /**
     * Método principal que ejecuta el programa.
     * Crea el cine, registra películas, permite al usuario seleccionar
     * una y luego genera la venta correspondiente.
     * 
     * @param args Argumentos de línea de comandos (no se utilizan).
     */
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