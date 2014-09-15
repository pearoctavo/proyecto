/**
 *
 * @author Pear Team
 */

package com.umariana.webappsVEAl.mundo;

import java.util.*;

/**
 * Clase principal de la aplciación - webappsVEAl
 */
public class Tienda 
{
    /// ---------------------------------------
    /// Atributos
    /// ---------------------------------------
    /**
     * Lista de las lineas de marcas registradas en el sistema
     */
    private ArrayList<Linea> lineas;
    
    /**
     * Lista de las marcas vehiculares registradas en el sistema
     */
    private ArrayList<Marca> marcas;
    
    /**
     * Lista de los vehiculos registrados en el sistema
     */
    private ArrayList<Vehiculo> vehiculos;
    
    /// ---------------------------------------
    /// Constructor
    /// ---------------------------------------
    /**
     * Constructor de la clase principal.
     */
    public Tienda()
    {
        lineas = new ArrayList<Linea>();
        marcas = new ArrayList<Marca>();
        vehiculos = new ArrayList<Vehiculo>();
    }
    
    /// ---------------------------------------
    /// Metodos
    /// ---------------------------------------
    /**
     * Método que adiciona una nueva línea de marca vehicular al sistema
     * @param pNombre - Nombre de la línea de marca. pNombre != null
     * @throws Exception - La línea ya existe
     */
    public void adicionarLinea(String pNombre) throws Exception
    {
        
    }
    
    /**
     * Método que adiciona una nueva marca vehicular al sistema
     * @param pNombre - Nombre de la marca. pNombre != null
     * @param pPais - País del origen de la marca. pPais != null
     * @throws Exception - La marca ya existe
     */
    public void adicionarMarca(String pNombre, String pPais) throws Exception
    {
        
    }
    
    /**
     * Método que adiciona un nuevo vehículo al sistema
     * @param pCosto - Costo, valor o precio del vehículo en el mercado. pCosto != null && pCosto > 0.
     * @param pImagen - Imagen del vehículo. pImagen != null.
     * @param pLinea - Linea de la marca vehicular. pLinea != null.
     * @param pMarca - Marca vehicular. pMarca != null.
     * @param pModelo - Modelo o año en que el vehículo fue fabricado. pModelo != null.
     * @param pPlaca - Placa del vehículo. pPlaca != null.
     * @throws Exception - El vehículo ya existe
     */
    public void adicionarVehiculo(double pCosto, String pImagen, Linea pLinea, Marca pMarca, String pModelo, String pPlaca) throws Exception
    {
        
    }
    
    /**
     * Método que retorna una linea dado su nombre como parametro.
     * @param pMarca - Nombre de la marca a la que pertenece la línea. pMarca != null.
     * @param pNombre - Nombre de la línea. pNombre != null.
     * @return linea
     */
    public Linea buscarLinea(String pMarca, String pNombre)
    {
        Linea linea = null;
        
        return linea;
    }
    
    /**
     * Método que retorna una linea dado su nombre como parametro.
     * @param pNombre - Nombre de la marca. pNombre != null.
     * @return marca
     */
    public Marca buscarMarca(String pNombre)
    {
        Marca marca = null;
        
        return marca;
    }
    
    /**
     * Método que retorna un vehículo dada su placa como parametro.
     * @param pPlaca - Placa del vehículo. pPlaca != null.
     * @return vehiculo
     */
    public Vehiculo buscarVehiculo(String pPlaca)
    {
        Vehiculo vehiculo = null;
        
        return vehiculo;
    }
    
    /**
     * Método que elimina una línea de marca vehicular del sistema según su nombre.
     * @param pNombre - Nombe de la línea. pNombre != null.
     * @throws Exception - La línea no existe.
     */
    public void eliminarLinea(String pNombre) throws Exception
    {
        
    }
    
    /**
     * Método que elimina una marca vehicular del sistema según su nombre.
     * @param pNombre - Nombre de la marca. pNombre != null.
     * @throws Exception - La marca no existe.
     */
    public void eliminarMarca(String pNombre) throws Exception
    {
        
    }
    
    /**
     * Método que elimina un vehículo del sistema según su placa.
     * @param pPlaca - Placa del vehículo. pPlaca != null.
     * @throws Exception - El vehículo no existe.
     */
    public void eliminarVehiculo(String pPlaca) throws Exception
    {
        
    }
    
    /**
     * Método que módifica los datos de una línea. 
     * Para su modificación es necesario conocer la marca a la que pertenece la línea, la línea que se desea modificar y los nuevos valores de la línea.
     * @param pLinea - Nombre de la linea que se desea modificar. pLinea != null.
     * @param pMarca - Nombre de la marca a la que pertenece la línea. pMarca != null.
     * @param pNombre - Nombre modificado de la línea.
     * @throws Exception - La marca no existe || La línea no exise
     */
    public void modificarLinea(String pLinea, String pMarca, String pNombre) throws Exception
    {
        
    }
    
    /**
     * Método que modifica los datos de una marca.
     * Para su modificación es ncesario conocer la marca a la que se desea modificar y los nuevos valores de la marca.
     * @param pMarca - Nombre de la marca que se desa modificar. pMarca != null.
     * @param pNombre - Nombre modificado de la marca. pNombre != null.
     * @param pPais - País modificado de la marca. pPais != null.
     * @throws Exception - La marca no existe || El nuevo nombre de la marca ya se encuentra reistrado
     */
    public void modificarMarca(String pMarca, String pNombre, String pPais) throws Exception
    {
        
    }
    
    /**
     * Método que modifica los datos de un vehículo.
     * @param actualPlaca - Placa del vehículo que se desea modificar. actualPlaca != null.
     * @param pCosto - Costo modificado del vehículo. pCosto != null.
     * @param pImagen - Imagen modificada del vehículo. pImagen != null.
     * @param pLinea - Linea modificada del vehículo. pLinea != null.
     * @param pMarca - Marca modificada del vehículo. pMarca != null.
     * @param pModelo - Modelo modificado del vehículo. pModelo != null.
     * @param pPlaca - Placa modificada del vehículo. pPlaca != null.
     * @throws Exception - El vehículo no existe || La nueva placa del vehículo ya se encuentra registrada
     */
    public void modificarVehiculo(String actualPlaca, double pCosto, String pImagen, Linea pLinea, Marca pMarca, String pModelo, String pPlaca) throws Exception
    {
        
    }
    
    /**
     * Método que retorna la lista de las lineas registradas en el sistema
     * @return lineas
     */
    public ArrayList<Linea> darListaLineas()
    {
        return lineas;
    }
    
    /**
     * Método que retorna la lista de las marcas registradas en el sistema
     * @return marcas
     */
    public ArrayList<Marca> darListaMarcas()
    {
        return marcas;
    }
    
    /**
     * Método que retorna la lista de vehiculos registrados en el sistema
     * @return vehiculos
     */
    public ArrayList<Vehiculo> darListaVehiculos()
    {
        return vehiculos;
    }
}
