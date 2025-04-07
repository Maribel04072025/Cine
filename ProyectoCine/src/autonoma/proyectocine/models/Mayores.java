/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.proyectocine.models;

/**
 * Representa a un usuario mayor de edad.
 * Este tipo de usuario tiene un descuento fijo de 1000 unidades monetarias
 * sobre el costo base de la boleta.
 * 
 * @author  Mateo Quintero <mateo.quinterom@autonoma.edu.co>
 * @version 1.0
 * @since   2025/04/07
 * @see     autonoma.proyectocine.models.Usuario
 */
public class Mayores extends Usuario {

    /**
     * Crea un nuevo usuario del tipo "Mayores".
     * Se establece el tipo automáticamente al llamar al constructor de la superclase.
     */
    public Mayores() {
        super("Mayores");
    }

    /**
     * Retorna el descuento fijo aplicado a los usuarios mayores.
     * 
     * @return 1000 unidades monetarias como descuento.
     */
    @Override
    public int descuentoUsuario() {
        return 1000;
    }
}
