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
    * metodo que consulta una linea por su nombre
    * @param pNombre nombre de la linea. nombre !="" and nombre !=null
    * @return lasLineas
    * @throws Exception - La clase no se encuentra
    * @throws Exception - error de sentencia sql
    */
    public ArrayList consultar(String pNombre) throws SQLException, ClassNotFoundException
	{
		ArrayList lasLineas = new ArrayList();
		String sqlConsultar = "SELECT nombre FROM linea WHERE nombre='"+ pNombre +"'";
		Connection miConexion = fachada.conectar();
		if(miConexion != null)
		{

			Statement instruccion = miConexion.createStatement();
			ResultSet tabla = instruccion.executeQuery(sqlConsultar);
			while(tabla.next())
			{
				Linea miLinea;
                            miLinea = new Linea(tabla.getString("nombre"));
				lasLineas.add(miLinea);
			}

		}
		fachada.desconectar(miConexion);
		return lasLineas;
	}
    
    /**
    * metodo que modifica una linea de la base de datos
    * @param pNombre nombre de la Linea. nombre !="" and nombre !=null
    * @throws Exception - La clase no se encuentra
    * @throws Exception - error de sentencia sql
    */
    public void modificarLinea(String pNombre) throws ClassNotFoundException, SQLException
	{
		String sql = "update linea set nombre='"+ pNombre +"' where nombre='"+ pNombre +"'";
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
    * metodo que elimina una linea de la base de datos
    * @param pNombre nombre de la linea. nombre !="" and nombre !=null
    * @throws Exception - La clase no se encuentra
    * @throws Exception - error de sentencia sql
    */
    public void eliminarLinea(String pNombre) throws ClassNotFoundException, SQLException
	{
		String sql = "DELETE FROM linea Where nombre='"+pNombre+"'";
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
