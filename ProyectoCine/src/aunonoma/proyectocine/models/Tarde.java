/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aunonoma.proyectocine.models;

/**
 * Clase donde el duescuento es %
 * 
 * @author  Mateo Quintero
 * @version 0.1
 * @since   2025/07/20
 * @see     autonoma.aunonoma.proyectocine.models
 */
public class Tarde extends Funcion{

    public Tarde() {
        //se indica que el tipo es tarde
        super("Tarde");
    }

    @Override
    public double descuentoProsentaje() {
        ///50%
       return 0.1;
    }
    
}
