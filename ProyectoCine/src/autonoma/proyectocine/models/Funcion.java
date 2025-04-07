/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.proyectocine.models;

/**
 * Clase abstracta que representa una función de cine.
 * Define el tipo de función (por ejemplo, matiné, noche, estreno) y
 * un método abstracto para obtener el porcentaje de descuento
 * correspondiente a ese tipo de función.
 * 
 * Las subclases deben implementar el método {@code descuentoProsentaje()}
 * para definir la lógica del descuento según el tipo de función.
 * 
 * @author Mateo Quintero <mateo.quinterom@autonoma.edu.co>
 * @version 1.0
 * @since 2025/03/31
 */
public abstract class Funcion {

    /**
     * Tipo de función (matiné, estreno, noche, etc.).
     */
    private String tipo;

    /**
     * Constructor que permite crear una función indicando su tipo.
     * 
     * @param tipo Nombre o categoría de la función.
     */
    public Funcion(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Devuelve el tipo de la función.
     * 
     * @return Tipo de la función.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Método abstracto que debe ser implementado por las subclases
     * para calcular el porcentaje de descuento que se aplica a esta función.
     * 
     * @return Porcentaje de descuento en formato decimal (por ejemplo, 0.1 para 10%).
     */
    public abstract double descuentoProsentaje();
}