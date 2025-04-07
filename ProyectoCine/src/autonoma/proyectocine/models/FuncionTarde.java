/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.proyectocine.models;

/**
 * Representa una función de tipo tarde.
 * Esta función cuenta con un descuento del 10%.
 * 
 * @author  Maribel Ceballos <maribel.ceballosc@gmail.com>
 * @version 1.0
 * @since   2025/03/31
 * @see     autonoma.proyectocine.models.Funcion
 */
public class FuncionTarde extends Funcion {

    /**
     * Crea una nueva función de tipo tarde.
     * El tipo de función se establece como "Funcion de Tarde".
     */
    public FuncionTarde() {
        super("Funcion de Tarde");
    }

    /**
     * Retorna el porcentaje de descuento aplicable para funciones de tarde.
     * 
     * @return 0.1, que representa un 10% de descuento.
     */
    @Override
    public double descuentoProsentaje() {
        return 0.1;
    }
}