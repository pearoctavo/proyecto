/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.umariana.webappsVEAl.persistencia;

import com.umariana.webappsVEAl.mundo.Linea;
import com.umariana.webappsVEAl.mundo.Marca;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class LineaDAO {
    
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
    * Constructor de la clase LineaDAO.
    */
    public LineaDAO()
        {
                fachada = new Fachada();
        }
    
     /// ---------------------------------------
    /// Metodos
    /// ---------------------------------------
    /**
    * metodo que agrega una linea a la base de datos
    * @param pLinea la linea. pLinea !=null
    * @param pMarca la marca asosiada a la linea pMarca !=null
    * @throws Exception - La clase no se encuentra
    * @throws Exception - error de sentencia sql
    */
    public void agregarLinea(Linea pLinea, Marca pMarca) throws ClassNotFoundException, SQLException
	{
		String sql = "Insert into linea (nombre_linea, nombre_marca) values('" + pLinea.getNombre()+"', '" + pMarca.getNombreMarca()+")";
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
		String sqlConsultar = "SELECT nombre_linea FROM linea WHERE nombre_linea='"+ pNombre +"'";
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
		String sql = "update linea set nombre_linea='"+ pNombre +"' where nombre_linea='"+ pNombre +"'";
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
		String sql = "DELETE FROM linea Where nombre_linea='"+pNombre+"'";
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
