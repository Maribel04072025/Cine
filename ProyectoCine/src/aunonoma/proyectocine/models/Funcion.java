/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aunonoma.proyectocine.models;

/**
 * Clase abstract donde se va indicar los fiferentes descuentos por funcion
 * 
 * @author  Mateo Quintero
 * @version 0.1
 * @since   2025/07/20
 * @see     autonoma.aunonoma.proyectocine.models
 */
public abstract class Funcion {
    private String tipo;
    
    
    //////////////////////////////////
    /// Constructor
    ///
    public Funcion(String tipo) {
        this.tipo = tipo;
    }
    
    public abstract double descuentoProsentaje();

    
    
    
}
