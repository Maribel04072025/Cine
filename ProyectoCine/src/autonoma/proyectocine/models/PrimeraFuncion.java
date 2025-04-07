/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.proyectocine.models;

/**
 * Clase donde el duescuento es 50%
 * 
 * @author  Mateo Quintero
 * @version 0.1
 * @since   2025/07/20
 * @see     autonoma.aunonoma.proyectocine.models
 */
public class PrimeraFuncion extends Funcion{

    public PrimeraFuncion() {
        //se indica qeu el tipo de funcion es la primera 
        super("PrimeraFuncion");
    }

    @Override
    public double descuentoProsentaje() {
        ///50%
       return 0.5;
    }
    
}
