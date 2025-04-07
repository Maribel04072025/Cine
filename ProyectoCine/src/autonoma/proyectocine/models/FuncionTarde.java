/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.proyectocine.models;

/**
 * Clase donde el duescuento es %
 * 
 * @author  Mateo Quintero
 * @version 0.1
 * @since   2025/07/20
 * @see     autonoma.aunonoma.proyectocine.models
 */
public class FuncionTarde extends Funcion{

    public FuncionTarde() {
        //se indica que el tipo es tarde
        super("Funcion de Tarde");
    }

    @Override
    public double descuentoProsentaje() {
        ///10%
       return 0.1;
    }
    
}
