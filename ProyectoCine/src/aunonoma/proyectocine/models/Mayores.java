/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aunonoma.proyectocine.models;

/**
 *
 * @author mateo
 */
public class Mayores extends Usuario {

    public Mayores() {
        super("Mayores");
    }

    @Override
    public int descuentoUsuario() {
        return 1000;
    }
    
}
