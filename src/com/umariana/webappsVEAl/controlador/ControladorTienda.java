/**
 *
 * @author Pear Team
 */

package com.umariana.webappsVEAl.controlador;

import com.umariana.webappsVEAl.mundo.Tienda;

/**
 * Controlador de la clase Tienda que permite la conexión entre mundo y vis
 */
public class ControladorTienda 
{
    ///----------------------------------------------
    /// Atributos
    ///----------------------------------------------
    /**
     * Relación con la clase principal del mundo
     */
    private Tienda tienda;
    
    ///----------------------------------------------
    /// Constructor
    ///----------------------------------------------
    /**
     * Constructor del controlador
     */
    public ControladorTienda( )
    {
        tienda = new Tienda( );
    }
    
    /// ---------------------------------------
    /// Metodos
    /// ---------------------------------------
    /**
     * Llama al evento de tipo get del formulario tienda
     */
    public void doGet( )
    {
        
    }
    
    /**
     * Llama al evento de tipo post del formulario tienda
     */
    public void doPost( )
    {
        
    }
    
    /**
     * Ejecuta una acción del formulario tienda
     */
    public void ejecutar( )
    {
        
    }
}