package autonoma.proyectocine.models;

import java.util.Scanner;

/**
 * La clase {@code Boleta} representa una boleta de cine, que contiene información
 * sobre la película, el usuario que la usa, el número de la boleta y el precio final
 * con descuentos aplicados.
 * 
 * Esta clase permite asignar un tipo de usuario, calcular el precio final teniendo
 * en cuenta descuentos por tipo de función y usuario, y gestionar los datos
 * relacionados a la boleta.
 * 
 * @author Maribel Ceballos <maribel.ceballosc@gmail.com>
 * @version 1.0
 * @since 2025/03/31
 */
public class Boleta {

    private int numeroBoleta;
    private Pelicula pelicula;
    private Usuario usuario;
    private double precioFinal = 0;

    /**
     * Crea una boleta con el número especificado y la película asociada.
     * 
     * @param numeroBoleta Número identificador de la boleta.
     * @param pelicula Película asociada a la boleta.
     */
    public Boleta(int numeroBoleta, Pelicula pelicula) {
        this.numeroBoleta = numeroBoleta;
        this.pelicula = pelicula;
    }

    /**
     * Obtiene el número de la boleta.
     * 
     * @return Número de la boleta.
     */
    public int getNumeroBoleta() {
        return numeroBoleta;
    }

    /**
     * Obtiene la película asociada a la boleta.
     * 
     * @return Película de la boleta.
     */
    public Pelicula getPelicula() {
        return pelicula;
    }

    /**
     * Obtiene el usuario que usará la boleta.
     * 
     * @return Usuario asociado.
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Obtiene el precio final calculado de la boleta.
     * 
     * @return Precio final con descuentos.
     */
    public double getPrecioFinal() {
        return precioFinal;
    }

    /**
     * Establece el número de la boleta.
     * 
     * @param numeroBoleta Número nuevo.
     */
    public void setNumeroBoleta(int numeroBoleta) {
        this.numeroBoleta = numeroBoleta;
    }

    /**
     * Establece la película asociada.
     * 
     * @param pelicula Película que se asignará.
     */
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    /**
     * Establece el usuario que usará la boleta.
     * 
     * @param usuario Usuario asociado.
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Establece el precio final de la boleta.
     * 
     * @param precioFinal Precio a asignar.
     */
    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    /**
     * Calcula el precio final de la boleta aplicando el descuento correspondiente
     * al tipo de usuario y al tipo de función de la película.
     * 
     * Si no se ha asignado un usuario a la boleta, se imprime un mensaje de error.
     */
    public void calcularPrecioBoleta() {
        System.out.println("--------------------------------------------------- ");
        try {
            System.out.println("Costo base de la película: " + this.pelicula.getCostoBase());
            System.out.println("Descuento por función de tipo " + this.pelicula.getFuncion().getTipo()
                    + " es igual a " + (this.pelicula.getFuncion().descuentoProsentaje() * 100) + "%");
            System.out.println("Descuento por usuario tipo " + this.usuario.getTipo()
                    + " es igual a " + this.usuario.descuentoUsuario());

            this.precioFinal = this.pelicula.getCostoBase()
                    - this.usuario.descuentoUsuario()
                    - (this.pelicula.getCostoBase() * this.pelicula.getFuncion().descuentoProsentaje());

        } catch (NullPointerException e) {
            System.out.println("ERROR: se necesita ingresar un usuario a la boleta");
        }
    }

    /**
     * Permite seleccionar el tipo de usuario que usará la boleta a través
     * de un menú por consola.
     * 
     * @param entrada Scanner utilizado para la entrada del usuario.
     */
    public void tipoUsuario(Scanner entrada) {
        int op;
        System.out.println("\n=== Ingrese qué tipo de usuario va a usar la boleta " + this.numeroBoleta + " ===");
        System.out.println("1. Niño");
        System.out.println("2. Adulto");
        System.out.println("3. Mayor");

        op = entrada.nextInt();
        entrada.nextLine(); // limpiar buffer

        switch (op) {
            case 1:
                System.out.println("¡Felicidades! El niño tiene un descuento de 500");
                this.usuario = new Ninio();
                break;
            case 2:
                System.out.println("Disfrute la película, usuario adulto.");
                this.usuario = new Adultos();
                break;
            case 3:
                System.out.println("¡Felicidades! El mayor tiene un descuento de 1000");
                this.usuario = new Mayores();
                break;
            default:
                System.out.println("Número incorrecto");
                break;
        }
    }
}
