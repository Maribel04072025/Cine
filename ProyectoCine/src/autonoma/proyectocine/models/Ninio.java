/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.proyectocine.models;

/**
 *
 * @author mateo
 */
public class Ninio extends Usuario {

    public Ninio() {
        super("Niño");
    }

    @Override
    public int descuentoUsuario() {
        return 500;
    }
    
}
