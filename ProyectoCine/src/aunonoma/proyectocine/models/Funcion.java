/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aunonoma.proyectocine.models;

/**
 *
 * @author mateo
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
