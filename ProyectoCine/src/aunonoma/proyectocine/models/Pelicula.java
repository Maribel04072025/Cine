/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aunonoma.proyectocine.models;

/**
 * Clase boleta donde se va dar toda la informacion de la pelicula
 * 
 * @author  Mateo Quintero
 * @version 0.1
 * @since   2025/07/20
 * @see     autonoma.aunonoma.proyectocine.models
 */
public class Pelicula {
    
    
    //////////////////////////////////
    /// Atributos
    private String titulo;
    private Funcion funcion;
    private int costoBase;
    
    //////////////////////////////////
    /// Constructor
    ///
    public Pelicula(String titulo, int costoBase) {
        this.titulo = titulo;
        this.costoBase = costoBase;
    }

    //////////////////////////////////
    /// Metodos de acceso (get)
    ///
    
    public String getTitulo() {
        return titulo;
    }

    public int getCostoBase() {
        return costoBase;
    }
    
    //////////////////////////////////
    /// Metodos de acceso (set)
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCostoBase(int costoBase) {
        this.costoBase = costoBase;
    }
    
    
}
