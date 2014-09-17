    /*
    * To change this license header, choose License Headers in Project Properties.
    * To change this template file, choose Tools | Templates
    * and open the template in the editor.
    */

    package com.umariana.webappsVEAl.persistencia;

import com.umariana.webappsVEAl.mundo.Vehiculo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

    /**
    *
    * @author Juan
    */
    public class VehiculoDAO {


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
    * Constructor de la clase vehiculoDAO.
    */
    public VehiculoDAO()
        {
                fachada = new Fachada();
        }
    
    /// ---------------------------------------
    /// Metodos
    /// ---------------------------------------
    /**
    * metodo que agrega un vehiculo a la base de datos
    * @param pVehiculo el vehiculo. pVehiculo !=null
    * @throws Exception - La clase no se encuentra
    * @throws Exception - error de sentencia sql
    */
    public void agregarVehiculo(Vehiculo pVehiculo) throws ClassNotFoundException, SQLException
	{
		String sql = "Insert into vehiculo (placa, costo, imagen, linea, marca, modelo,nombre_linea) values('" + pVehiculo.getPlaca()+ "', " + pVehiculo.getCosto() + ","+ pVehiculo.getImagen() + "," + pVehiculo.getLinea() + "," + pVehiculo.getMarca() + ","+ pVehiculo.getModelo() + ","+ pVehiculo.getLinea().getNombre() +")";
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
    * metodo que consulta un vehiculo por su placa
    * @param pPlaca placa del vehiculo. placa !="" and placa !=null
    * @return losVehiculos
    * @throws Exception - La clase no se encuentra
    * @throws Exception - error de sentencia sql
    */
    public ArrayList consultar(String pPlaca) throws SQLException, ClassNotFoundException
	{
		ArrayList losVehiculos = new ArrayList();
		String sqlConsultar = "SELECT placa, costo, imagen, linea, marca, modelo,nombre_linea FROM vehiculo WHERE placa='"+ pPlaca +"'";
		Connection miConexion = fachada.conectar();
		if(miConexion != null)
		{

			Statement instruccion = miConexion.createStatement();
			ResultSet tabla = instruccion.executeQuery(sqlConsultar);
			while(tabla.next())
			{
				Vehiculo miVehiculo;
                            miVehiculo = new Vehiculo(Double.parseDouble(tabla.getString("costo")),tabla.getString("imagen"),tabla.getString("linea"),tabla.getString("marca"),tabla.getString("modelo"),tabla.getString("placa") );
				losVehiculos.add(miVehiculo);
			}

		}
		fachada.desconectar(miConexion);
		return losVehiculos;
	}
    
    /**
    * metodo que modifica un vehiculo de la base de datos
    * @param pCosto costo del vehiculo. costo > 0
    * @param pImagen imagen del vehiculo. imagen !=null
    * @param pLinea linea del vehiculo. linea !=null
    * @param pMarca marca del vehiculo. marca !=null
    * @param pModelo modelo del vehiculo. modelo !="" and modelo !=null
    * @param pPlaca placa del vehiculo. placa !="" and placa !=null
    * @throws Exception - La clase no se encuentra
    * @throws Exception - error de sentencia sql
    */
    public void modificarVehiculo(String pPlaca, double pCosto,  String pImagen, String pLinea, String pMarca, String pModelo) throws ClassNotFoundException, SQLException
	{
		String sql = "update vehiculo set costo="+ pCosto +", imagen='"+ pImagen +"', linea='"+ pLinea +"', marca='"+ pMarca +"', modelo='"+ pModelo +"' where placa='"+ pPlaca +"'";
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
    * metodo que elimina un vehiculo de la base de datos
    * @param pPlaca placa del vehiculo. placa !="" and placa !=null
    * @throws Exception - La clase no se encuentra
    * @throws Exception - error de sentencia sql
    */
    public void eliminarVehiculo(String pPlaca) throws ClassNotFoundException, SQLException
	{
		String sql = "DELETE FROM vehiculo Where placa='"+pPlaca+"'";
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
