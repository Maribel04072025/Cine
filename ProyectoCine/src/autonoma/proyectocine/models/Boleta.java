package autonoma.proyectocine.models;

import java.util.Scanner;

public class Boleta {

    private int numeroBoleta;
    private Pelicula pelicula;
    private Usuario usuario;
    private double precioFinal = 0;

    public Boleta(int numeroBoleta, Pelicula pelicula) {
        this.numeroBoleta = numeroBoleta;
        this.pelicula = pelicula;
    }

    public int getNumeroBoleta() {
        return numeroBoleta;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setNumeroBoleta(int numeroBoleta) {
        this.numeroBoleta = numeroBoleta;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public void calcularPrecioBoleta() {
        System.out.println("--------------------------------------------------- ");
        try {
            System.out.println("Costo base de la película: " + this.pelicula.getCostoBase());
            System.out.println("Descuento por función de tipo " + this.pelicula.getFuncion().getTipo()
                    + " es igual a " + (this.pelicula.getFuncion().descuentoProsentaje()*100)+"%");
            System.out.println("Descuento por usuario tipo " + this.usuario.getTipo()
                    + " es igual a " + this.usuario.descuentoUsuario());

            this.precioFinal = this.pelicula.getCostoBase()
                    - this.usuario.descuentoUsuario()
                    - (this.pelicula.getCostoBase() * this.pelicula.getFuncion().descuentoProsentaje());

        } catch (NullPointerException e) {
            System.out.println("ERROR: se necesita ingresar un usuario a la boleta");
        }
    }

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
