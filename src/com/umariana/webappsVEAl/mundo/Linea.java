/**
 *
 * @author Pear Team
 */

package com.umariana.webappsVEAl.mundo;

import java.util.*;

/**
 * Clase que representa a una línea de marca vehicular
 */
public class Linea 
{
    /// ---------------------------------------
    /// Atributos
    /// ---------------------------------------
    /**
     * Nombre de la linea
     */
    private String nombre;
    
    /**
     * Lista de vehiculos de la línea
     */
    private ArrayList<Vehiculo> vehiculos;

    /// ---------------------------------------
    /// Constructor
    /// ---------------------------------------
    /**
     * Contructor de la clase
     * @param pNombre Nombre de la linea. pLinea != null
     */
    public Linea(String pNombre)
    {
        nombre = pNombre;
        vehiculos = new ArrayList<Vehiculo>();
    }

    /// ---------------------------------------
    /// Metodos
    /// ---------------------------------------
    /**
     * Retorna el nombre de la linea
     * @return nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * Modifica el nombre de la línea
     * @param pNombre Nombre de la linea. pLinea != null
     */
    public void setNombre(String pNombre)
    {
        nombre = pNombre;
    }

    /**
     * metodo que adiciona un vehiculo
     * para adicionar un vehiculo se requiere saber la marca del vehiculo y la linea
     * @param pCosto--- costo del vehiculo 
     * @param pImagen--- imagen del vehiculo
     * @param pLinea--- linea a la que pertenece el vehiculo
     * @param pMarca--- marca a la que pertence la linea del vehiculo
     * @param pModelo--- modelo del vehiculo
     * @param pPlaca--- placa del vehiculo
     * @throws Exception la marca no existe || El vehiculo ya existe
     */
    public void adicionarVehiculo(double pCosto, String pImagen, Linea pLinea, Marca pMarca, String pModelo, String pPlaca) throws Exception
    {

    }

    /**
     * Metodo que busca un vehiculo
     * para buscar un vehiculo se requiere conocer la placa del vehiculo que se desea buscar
     * @param pPlaca--- placa del vehiculo a buscar 
     * @throws Exception la placa no existe
     */
    public void buscarVehiculo (String pPlaca) throws Exception
    {

    }
    
    /**
     * metodo que elimina un vehiculo
     * para eliminar un vehiculo se requiere conocer la placa del vehiculo que se desea eliminar
     * @param pPlaca - placa del vehiculo a eliminar
     * @throws Exception la placa no existe
     */
    public void eliminarVehiculo(String pPlaca) throws Exception
    {
    
    }

    /**
     * metodo que modifica vehiculo
     * para modificar un vehiculo se requiere saber la marca del vehiculo y la linea
     * @param pCosto - costo del vehiculo 
     * @param pImagen - imagen del vehiculo
     * @param pLinea - linea a la que pertenece el vehiculo
     * @param pMarca - marca a la que pertence la linea del vehiculo
     * @param pModelo - modelo del vehiculo
     * @param pPlaca - placa del vehiculo
     * @throws Exception la marca no existe || la linea ya existe
     */
    public void modificarVehiculo(double pCosto, String pImagen, Linea pLinea, Marca pMarca, String pModelo, String pPlaca) throws Exception
    {

    }
    
    /**
     * Retorna la lista de vehiculos de la linea
     * @return vehiculos
     */
    public ArrayList<Vehiculo> darListaVehiculos()
    {
        return vehiculos;
    }
}