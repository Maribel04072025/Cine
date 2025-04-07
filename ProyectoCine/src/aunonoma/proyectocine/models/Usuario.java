/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aunonoma.proyectocine.models;

/**
 *
 * @author mateo
 */
abstract class Usuario {
    private String tipo;
    
    
    //////////////////////////////////
    /// Constructor
    ///
    public Usuario(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
  public abstract int descuentoUsuario();
}
