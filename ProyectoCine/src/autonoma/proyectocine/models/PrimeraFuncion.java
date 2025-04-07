/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.proyectocine.models;

/**
 * Representa la primera función del día.
 * Esta función aplica un descuento del 50% sobre el costo base de la película.
 * 
 * @author  Maribel Ceballos <maribel.ceballosc@gmail.com>
 * @version 1.0
 * @since   2025/03/31
 * @see     autonoma.proyectocine.models.Funcion
 */
public class PrimeraFuncion extends Funcion {

    /**
     * Crea una nueva función identificada como la primera del día.
     * El tipo de función se establece como "PrimeraFuncion".
     */
    public PrimeraFuncion() {
        super("PrimeraFuncion");
    }

    /**
     * Retorna el porcentaje de descuento aplicable para la primera función.
     * 
     * @return 0.5, que representa un 50% de descuento.
     */
    @Override
    public double descuentoProsentaje() {
        return 0.5;
    }
}
