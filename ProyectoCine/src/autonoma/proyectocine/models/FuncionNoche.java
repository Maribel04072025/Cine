/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.proyectocine.models;

/**
 * Representa una función de tipo noche.
 * Esta función no cuenta con ningún tipo de descuento.
 * 
 * @author  Mateo Quintero <maribel.ceballosc@gmail.com>
 * @version 1.0
 * @since   2025/04/07
 * @see     autonoma.proyectocine.models.Funcion
 */
public class FuncionNoche extends Funcion {

    /**
     * Crea una nueva función de tipo noche.
     * El tipo de función se establece como "Funcion de Noche".
     */
    public FuncionNoche() {
        super("Funcion de Noche");
    }

    /**
     * Retorna el porcentaje de descuento aplicable para funciones de noche.
     * 
     * @return 0.0, ya que no hay descuento para este tipo de función.
     */
    @Override
    public double descuentoProsentaje() {
        return 0;
    }
}
