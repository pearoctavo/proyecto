/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.umariana.webappsVEAl.persistencia;

import com.umariana.webappsVEAl.mundo.Linea;
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
    * @throws Exception - La clase no se encuentra
    * @throws Exception - error de sentencia sql
    */
    public void agregarLinea(Linea pLinea) throws ClassNotFoundException, SQLException
	{
		String sql = "Insert into linea (nombre) values('" + pLinea.getNombre()+"')";
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
