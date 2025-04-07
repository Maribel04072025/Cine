package autonoma.proyectocine.models;

import java.util.Scanner;

public class Pelicula {

    private String titulo;
    private Funcion funcion;
    private int costoBase;

    public Pelicula(String titulo, int costoBase) {
        this.titulo = titulo;
        this.costoBase = costoBase;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCostoBase() {
        return costoBase;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCostoBase(int costoBase) {
        this.costoBase = costoBase;
    }

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
