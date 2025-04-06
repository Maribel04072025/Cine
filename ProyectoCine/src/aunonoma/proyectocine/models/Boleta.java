/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aunonoma.proyectocine.models;

import java.util.Scanner;

/**
 * Clase boleta donde se va calcular el precio de cada boleta de la venta del cine.
 * 
 * @author  Mateo Quintero
 * @version 0.1
 * @since   2025/07/20
 * @see     autonoma.DirectorioAmistades.views
 */
public class Boleta {
    
    //////////////////////////////////
    /// Atributos
    ///
    private int numeroBoleta;
    private Pelicula pelicula;
    private Usuario usuario;
    private double precioFinal = 0;

    
    //////////////////////////////////
    /// Constructor
    ///
    public Boleta(int numeroBoleta, Pelicula pelicula) {
        this.numeroBoleta = numeroBoleta;
        this.pelicula = pelicula;
    }

    
    //////////////////////////////////
    /// Metodos de acceso (get)
    ///
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

    //////////////////////////////////
    /// Metodos de acceso (set)
    ///
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
    
    //////////////////////////////////
    /// Metodos
    ///
    
    public void calcularPrecioBoleta(){
    try{
        
        /*se va calcular precio base de de boleta 
        
        this.pelicula.getCostoBase() = Costo base de la pelicua 
        this.usuario.descuentoUsuario() = descueto por usuario
        this.pelicula.getCostoBase()* this.pelicula.getFuncion().descuentoProsentaje() =  el valor del descueto por la funcion
        
        */
        System.out.println("Costo base de la pelicua  " + this.pelicula.getCostoBase() );
        System.out.println("descuento por Funcion de tipo "+  this.pelicula.getFuncion().getTipo() +" es igual " + this.pelicula.getFuncion().descuentoProsentaje() );
        System.out.println("descuento por Usuario tipo"+ this.usuario.getTipo() +" es igual " + this.usuario.descuentoUsuario() );
        
        
        this.precioFinal = this.pelicula.getCostoBase()-this.usuario.descuentoUsuario()-(this.pelicula.getCostoBase()* this.pelicula.getFuncion().descuentoProsentaje());
        
        //si expcion si no se creo el objeto usuario bien
    }catch(NullPointerException e){
        System.out.println("ERROR se necesita ingresar un usuario a la boleta ");
     }
    }

    
    public void tipoUsuario(){
        
        //se muestra lista de opciones
       int op;
       Scanner entrada = new Scanner(System.in);
            System.out.println("\n=== ingrse que usuario va utilizat la voleta " + this.numeroBoleta +" Funciones ===");
            System.out.println("ingrese 1 sie es Ninio");
            System.out.println("ingrese 2 si es Adulto");
            System.out.println("ingrese 3 si es mayor");
            
            op = entrada.nextInt();
            entrada.nextLine();
            
            switch (op){
                case 1:
            /// se va a especificar bien que funcion es el objeto funcion    
                System.out.println("felicitaciones el ninio tien un descuuento de 500");
                this.usuario = new Ninio();
                System.out.println("disfrute la pelicula");
                break;   
                case 2: 
                System.out.println("disfrute la pelicula usuario adulto");
                this.usuario = new Adultos();
                
                break;
                case 3:
                System.out.println("felicitaciones el ninio tien un descuuento de 1000");
                this.usuario = new Mayores();
                System.out.println("disfrute la pelicula");
                break;
                
                default:
                System.out.println("numero incorrecto");
                break;
                
    
        }
       entrada.close();
    
    
        
    }
}
