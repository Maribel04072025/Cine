/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aunonoma.proyectocine.models;

import java.util.Scanner;

/**
 * Clase boleta donde se va dar toda la informacion de la pelicula
 * 
 * @author  Mateo Quintero
 * @version 0.1
 * @since   2025/07/20
 * @see     autonoma.aunonoma.proyectocine.models
 */
public class Pelicula {
    
    
    //////////////////////////////////
    /// Atributos
    private String titulo;
    private Funcion funcion;
    private int costoBase;
    
    //////////////////////////////////
    /// Constructor
    ///
    public Pelicula(String titulo, int costoBase) {
        this.titulo = titulo;
        this.costoBase = costoBase;
    }

    //////////////////////////////////
    /// Metodos de acceso (get)
    ///
    
    public String getTitulo() {
        return titulo;
    }

    public int getCostoBase() {
        return costoBase;
    }
    
    //////////////////////////////////
    /// Metodos de acceso (set)
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCostoBase(int costoBase) {
        this.costoBase = costoBase;
    }
    
    
    public void tipoFuncion (){
        
        //se muestra lista de opciones
       int op;
       Scanner entrada = new Scanner(System.in);
            System.out.println("\n=== Funciones para "+ this.titulo + " ===");
            System.out.println("ingrese 1 para estar en la primer");
            System.out.println("ingrese 2 para estar en la tarde");
            System.out.println("ingrese 3 para estar en la noche");
            
            op = entrada.nextInt();
            entrada.nextLine();
            
            switch (op){
                case 1:
                    
                System.out.println("felicitaciones la primera funcion tendra descueto de 50%");
                this.funcion = new PrimeraFuncion();
                System.out.println("disfrute la pelicula");
                break;   
                case 2: 
                System.out.println("felicitaciones la funcion de la tarde tendra descueto de 10%");
                this.funcion = new FuncionTarde();
                System.out.println("disfrute la pelicula");
                break;
                case 3:
                System.out.println("lo lamentamos la funcion de la noche no tendra descueto");
                this.funcion = new FuncionNoche();
                System.out.println("disfrute la pelicula");
                break;
                
                default:
                System.out.println("numero incorrecto");
                break;
                
    
        }
    }
    
}
