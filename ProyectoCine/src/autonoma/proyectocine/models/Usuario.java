/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.proyectocine.models;

/**
 * Clase abstracta que representa un tipo de usuario que asiste al cine.
 * Cada tipo de usuario tiene un tipo (niño, adulto o mayor) y puede tener 
 * un descuento específico sobre el precio de la boleta.
 * 
 * Esta clase debe ser extendida por clases concretas como {@code Ninio}, 
 * {@code Adultos} o {@code Mayores}.
 * 
 * @author  Mateo Quintero <mateo.quinterom@autonoma.edu.co>
 * @version 1.0
 * @since   2025/04/07
 */
abstract class Usuario {
    private String tipo;

    /**
     * Constructor que define el tipo de usuario.
     * 
     * @param tipo Tipo de usuario (por ejemplo, "Niño", "Adulto", "Mayor").
     */
    public Usuario(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Devuelve el tipo de usuario.
     * 
     * @return Tipo del usuario.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Método abstracto que define el descuento aplicado según el tipo de usuario.
     * 
     * @return Descuento en valor monetario que aplica el usuario.
     */
    public abstract int descuentoUsuario();
}