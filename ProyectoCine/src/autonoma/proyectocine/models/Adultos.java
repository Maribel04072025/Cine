/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.proyectocine.models;

/**
 * Representa a un usuario de tipo Adulto dentro del sistema de cine.
 * Esta clase extiende la clase {@link Usuario} y define el comportamiento
 * específico para el tipo de usuario adulto, el cual no recibe descuento.
 * 
 * @author Mateo Quintero <mateo.quinterom@autonoma.edu.co>
 * @version 1.0
 * @since 2025/04/07
 */
public class Adultos extends Usuario {

    /**
     * Constructor de la clase Adultos.
     * Inicializa el tipo de usuario como "Adultos".
     */
    public Adultos() {
        super("Adultos");
    }

    /**
     * Devuelve el descuento correspondiente para el usuario adulto.
     * 
     * @return 0, ya que los adultos no tienen descuento.
     */
    @Override
    public int descuentoUsuario() {
        return 0;
    }
}
