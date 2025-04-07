/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.proyectocine.models;

/**
 * Representa a un usuario de tipo niño.
 * Este tipo de usuario tiene un descuento fijo de 500 unidades monetarias
 * sobre el costo base de la boleta.
 * 
 * @author  Maribel Ceballos <maribel.ceballosc@gmail.com>
 * @version 1.0
 * @since   2025/04/07
 * @see     autonoma.proyectocine.models.Usuario
 */
public class Ninio extends Usuario {

    /**
     * Crea un nuevo usuario del tipo "Niño".
     * Se establece el tipo automáticamente al llamar al constructor de la superclase.
     */
    public Ninio() {
        super("Niño");
    }

    /**
     * Retorna el descuento fijo aplicado a los usuarios de tipo niño.
     * 
     * @return 500 unidades monetarias como descuento.
     */
    @Override
    public int descuentoUsuario() {
        return 500;
    }
}
