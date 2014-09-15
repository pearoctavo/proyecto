/**
 *
 * @author Pear Team
 */

package com.umariana.webappsVEAl.mundo;

import java.util.*;

/**
 * Clase que representa a una línea de marca vehicular
 */
public class Marca 
{
    /// ---------------------------------------
    /// Atributos
    /// ---------------------------------------
    /**
     * nombre de la marca a la cual pertenece un vehiculo
     */
    private String nombreMarca;
        
    /**
     * pais de origen  a la cual pertenece la marca
     */
    private String paisOrigen;
       
    /**
     * contenedora de las lineas de marca
     */
    private ArrayList<Linea> lineas;
    
    /**
     * contenedora de los vehiculos de marca
     */
    private ArrayList<Vehiculo> vehiculos;
        
    /// ---------------------------------------
    /// Constructor
    /// ---------------------------------------
    /**
     * Constructor de la clase marca
     * @param pNombreMarca  nombre de la nueva marca
     * @param pPaisOrigen nombre del pais de origen
     */        
    public Marca(String pNombreMarca, String pPaisOrigen){
        nombreMarca =  pNombreMarca;
        paisOrigen =  pPaisOrigen;
        lineas = new ArrayList<Linea>();
        vehiculos = new ArrayList<Vehiculo>();
    }
    
    /// ---------------------------------------
    /// Metodos
    /// ---------------------------------------
    /**
     * metodo que devuelve el <tt> nombre de la marca </tt>
     * @return retorna el nombre de la marca
     */
    public String getNombreMarca()
    {
        return nombreMarca;
    }
    
    /**
     * metodo que cambia el <tt> nombre de marca</tt>
     * @param nombreMarca a cambiar
     */
    public void setNombreMarca(String nombreMarca)
    {
        this.nombreMarca = nombreMarca;
    }
        
    /*
     * metodo que devuelve el <tt> pais de origen de la marca </tt>
     * @return retorna el pais de origen de la marca
     */
    public String getPaisOrigen()
    {
        return nombreMarca;
    }
    
    /**
     * metodo que cambia el <tt> Pais de origen de marca</tt>
     * @param paisOrigen de origen a  cambiar
     */
    public void setPaisOrigen(String paisOrigen)
    {
        this.paisOrigen = paisOrigen;
    }
        
    /**
     * metodo que adiciona un nuevo vehiculo
     * @param pCosto costo del vehiculo
     * @param pImagen Imagen del vehiculo
     * @param pLinea Linea del vechilo
     * @param pMarca Marca del vehiculo
     * @param pModelo Modelo  del vehiculo
     * @param pPlaca placa del vehiclo
     */
    public void adicionarVehiculo(double pCosto, String pImagen,Linea pLinea, Marca pMarca, String pModelo, String pPlaca)
    {
        
    }
    
    /**
     * metodo que buscar un vehiculo
     * @param pPlaca placa del vehiclo 
     * @return vehiculo
     */ 
    public Vehiculo buscarVehiculo(String pPlaca)
    {
        Vehiculo vehiculo = null;
        
        return vehiculo;
    }
    
    /**
     * metodo que elimina un vehiculo 
     * @param pPlaca placa del vehiclo
     */
    public void eliminarVehiculo(String pPlaca)
    {
        
    }
    
    /**
     * metodo que modifica un vehiculo
     * @param pCosto costo del vehiculo
     * @param pImagen Imagen del vehiculo 
     * @param pLinea Linea del vechilo
     * @param pMarca Marca del vehiculo
     * @param pModelo Modelo  del vehiculo
     * @param pPlaca placa del vehiclo
     */
    public void modificarVehiculo(double pCosto, String pImagen,Linea pLinea, Marca pMarca, String pModelo, String pPlaca)
    {
        
    }

    /**
     * metodo que adiciona una nueva Linea
     * @param pNombreLinea nuevo nombre de la liena
     */
    public void adicionarLinea(String pNombreLinea)
    {
        
    }
        
    /**
     * metodo que busca una Linea
     * @param pNombreLinea nuevo nombre de la liena
     * @return linea
     */
    public Linea buscarLinea(String pNombreLinea)
    {
        Linea linea = null;
        
        return linea;
    }
        
    /**
     * metodo que elimina una Linea
     * @param pNombreLinea nuevo nombre de la liena
     */
    public void eliminarLinea(String pNombreLinea)
    {
            
    }
        
    /**
     * metodo que modifica una Linea
     * @param pLinea linea que se desea modificar
     * @param pNombreLinea nuevo nombre de la liena
     */
    public void modificarLinea(String pLinea, String pNombreLinea)
    {
        
    }
        
    /**
     * metodo que devuelve la contenedora de lineas
     * @return lineas
     */
    public ArrayList darLineas() 
    {
        return lineas;
    }
    
    
    public ArrayList<Vehiculo> darListaVehiculos()
    {
        return vehiculos;
    }
}