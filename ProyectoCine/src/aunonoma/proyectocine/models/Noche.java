/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aunonoma.proyectocine.models;

/**
 * Clase donde el duescuento es 0%
 * 
 * @author  Mateo Quintero
 * @version 0.1
 * @since   2025/07/20
 * @see     autonoma.aunonoma.proyectocine.models
 */
public class Noche extends Funcion{

    public Noche() {
        //se indica que el tipo es Noche
        super("Noche");
    }

    @Override
    public double descuentoProsentaje() {
        ///0%
       return 0;
    }
    
}
