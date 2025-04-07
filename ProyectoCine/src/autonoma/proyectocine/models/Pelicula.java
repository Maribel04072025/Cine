package autonoma.proyectocine.models;

import java.util.Scanner;

/**
 * Clase que representa una película con un título, costo base y una función asociada.
 * Permite definir el tipo de función (mañana, tarde o noche) con sus respectivos descuentos.
 * 
 * @author  Mateo Quintero <mateo.quinterom@autonoma.edu.co>
 * @version 1.0
 * @since   2025/04/07
 * @see     autonoma.proyectocine.models.Funcion
 */
public class Pelicula {

    private String titulo;
    private Funcion funcion;
    private int costoBase;

    /**
     * Crea una nueva película con un título y un costo base definido.
     * 
     * @param titulo     Título de la película.
     * @param costoBase  Costo base de la película.
     */
    public Pelicula(String titulo, int costoBase) {
        this.titulo = titulo;
        this.costoBase = costoBase;
    }

    /**
     * Obtiene el título de la película.
     * 
     * @return Título actual.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene el costo base de la película.
     * 
     * @return Costo base.
     */
    public int getCostoBase() {
        return costoBase;
    }

    /**
     * Retorna la función seleccionada para la película.
     * 
     * @return Tipo de función (mañana, tarde o noche).
     */
    public Funcion getFuncion() {
        return funcion;
    }

    /**
     * Asigna un nuevo título a la película.
     * 
     * @param titulo Nuevo título.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Asigna un nuevo costo base a la película.
     * 
     * @param costoBase Nuevo costo base.
     */
    public void setCostoBase(int costoBase) {
        this.costoBase = costoBase;
    }

    /**
     * Permite al usuario seleccionar el tipo de función asociada a la película,
     * lo cual influye en el descuento aplicado sobre el costo.
     * 
     * @param entrada Scanner utilizado para capturar la entrada del usuario.
     */
    public void tipoFuncion(Scanner entrada) {
        int op;

        System.out.println("\n=== Funciones para " + this.titulo + " ===");
        System.out.println("Ingrese 1 para la función de la mañana");
        System.out.println("Ingrese 2 para la función de la tarde");
        System.out.println("Ingrese 3 para la función de la noche");

        op = entrada.nextInt();
        entrada.nextLine(); // limpiar buffer

        switch (op) {
            case 1:
                System.out.println("¡Felicidades! La función de la mañana tiene 50% de descuento.");
                this.funcion = new PrimeraFuncion();
                break;
            case 2:
                System.out.println("¡La función de la tarde tiene 10% de descuento!");
                this.funcion = new FuncionTarde();
                break;
            case 3:
                System.out.println("La función de la noche no tiene descuento.");
                this.funcion = new FuncionNoche();
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }

        System.out.println("Disfrute la película");
    }
}