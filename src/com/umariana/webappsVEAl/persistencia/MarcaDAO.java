/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.umariana.webappsVEAl.persistencia;

import com.umariana.webappsVEAl.mundo.Marca;
import com.umariana.webappsVEAl.mundo.Tienda;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class MarcaDAO {
    
     /// ---------------------------------------
    /// Atributos
    /// ---------------------------------------
    /**
    * atributo que conecta con la clase fachada.
    */
    private Fachada fachada;
    
    /// ---------------------------------------
    /// Constructor
    /// ---------------------------------------
    /**
    * Constructor de la clase MarcaDAO.
    */
    public MarcaDAO()
        {
                fachada = new Fachada();
        }
    
     /// ---------------------------------------
    /// Metodos
    /// ---------------------------------------
    /**
    * metodo que agrega una marca a la base de datos
    * @param pMarca la linea. pLinea !=null
    * @param pTienda la Tienda asosiada a la marca. pTienda !=null
    * @throws Exception - La clase no se encuentra
    * @throws Exception - error de sentencia sql
    */
    public void agregarMarca(Marca pMarca, Tienda pTienda) throws ClassNotFoundException, SQLException
	{
		String sql = "Insert into marca (nombre_marca, pais_origen, nombre_tienda) values('" + pMarca.getNombreMarca()+"', '"+ pMarca.getPaisOrigen()+"', '"+ pTienda.toString()+"')";
		Connection miConexion = fachada.conectar();
		if(miConexion != null)
		{
			Statement instruccion = (Statement) miConexion.createStatement();
			int resultado = ((java.sql.Statement) instruccion).executeUpdate(sql);
			miConexion.close();
		}
		fachada.desconectar(miConexion);
	}
    
       /**
    * metodo que consulta una marca por su nombre
    * @param pNombre nombre de la marca. nombre !="" and nombre !=null
    * @return lasMarcas
    * @throws Exception - La clase no se encuentra
    * @throws Exception - error de sentencia sql
    */
    public ArrayList consultar(String pNombre) throws SQLException, ClassNotFoundException
	{
		ArrayList lasMarcas = new ArrayList();
		String sqlConsultar = "SELECT nombre_marca FROM marca WHERE nombre_marca='"+ pNombre +"'";
		Connection miConexion = fachada.conectar();
		if(miConexion != null)
		{

			Statement instruccion = miConexion.createStatement();
			ResultSet tabla = instruccion.executeQuery(sqlConsultar);
			while(tabla.next())
			{
				Marca miMarca;
                            miMarca = new Marca(tabla.getString("nombre_marca"),tabla.getString("pais_origen"));
				lasMarcas.add(miMarca);
			}

		}
		fachada.desconectar(miConexion);
		return lasMarcas;
	}
    
    /**
    * metodo que modifica una marca de la base de datos
    * @param pNombre nombre de la marca a buscar. nombre !="" and nombre !=null
    * @param pNuevoNombre nuevo nombre de la marca. nombre !="" and nombre !=null
    * @param pPais pais de la marca. pais !="" and pais !=null
    * @throws Exception - La clase no se encuentra
    * @throws Exception - error de sentencia sql
    */
    public void modificarLinea(String pNombre, String pNuevoNombre, String pPais) throws ClassNotFoundException, SQLException
	{
		String sql = "update marca set nombre_marca='"+ pNuevoNombre +"', pais_origen='"+ pPais +"' where nombre_marca='"+ pNombre +"'";
		Connection miConexion = fachada.conectar();
		if(miConexion != null)
		{
			Statement instruccion = (Statement) miConexion.createStatement();
			int resultado = ((java.sql.Statement) instruccion).executeUpdate(sql);
			miConexion.close();
		}
		fachada.desconectar(miConexion);
	}
        /**
    * metodo que elimina una marca de la base de datos
    * @param pNombre nombre de la marca. nombre !="" and nombre !=null
    * @throws Exception - La clase no se encuentra
    * @throws Exception - error de sentencia sql
    */
    public void eliminarMarca(String pNombre) throws ClassNotFoundException, SQLException
	{
		String sql = "DELETE FROM marca Where nombre_marca='"+pNombre+"'";
		Connection miConexion = fachada.conectar();
		if(miConexion != null)
		{
			Statement instruccion = (Statement) miConexion.createStatement();
			int resultado = ((java.sql.Statement) instruccion).executeUpdate(sql);
			miConexion.close();
		}
		fachada.desconectar(miConexion);
	}
    
    
    
}
