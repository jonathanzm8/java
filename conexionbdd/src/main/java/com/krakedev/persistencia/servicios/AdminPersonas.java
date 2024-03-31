package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Personas;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static void insertar(Personas persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a insertar>>> " + persona);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("insert into persona(cedula, nombre, apellido, fecha_nacimento, estado_civil)"
					+ "values(?, ?, ?, ?, ?)");
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setDate(4, new java.sql.Date(persona.getFecha_nacimiento().getTime()));
			ps.setString(5, persona.getEstado_civil().getCodigo());

			ps.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de Datos", e);
				throw new Exception("Error con la base de Datos");
			}
		}
	}

	public static void actualizar(Personas persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"UPDATE persona SET nombre = ?, apellido = ?, estatura = ?, fecha_nacimento = ?, hora_nacimeinto = ?, cantidad_ahorrada = ?, numeros_hijos = ?, estado_civil = ? WHERE cedula = ?;");
			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setDouble(3, persona.getEstatura());
			ps.setDate(4, new java.sql.Date(persona.getFecha_nacimiento().getTime()));
			ps.setTime(5, new java.sql.Time(persona.getHora_nacimiento().getTime()));
			ps.setBigDecimal(6, persona.getCantidad_ahorrada());
			ps.setInt(7, persona.getNumero_hijos());
			ps.setString(8, persona.getEstado_civil().getCodigo());
			ps.setString(9, persona.getCedula());

			ps.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("Error al actualizar", e);
			throw new Exception("Error al actualizar");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de Datos", e);
				throw new Exception("Error con la base de Datos");
			}
		}
	}

	public static void eliminar(String cedula) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("DELETE FROM persona WHERE cedula = ?");
			ps.setString(1, cedula);
			ps.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("Error al eliminar", e);
			throw new Exception("Error al eliminar");
		} finally {
			try {
				con.close();
			} catch(SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}

		}
	}
	
	public static ArrayList<Personas> buscarPorNombre(String nombreBusqueda) throws Exception{
		ArrayList<Personas> personas= new ArrayList<Personas>();
		Connection con = null;
		PreparedStatement ps= null;
		ResultSet rs= null;
		
		try {
			con=ConexionBDD.conectar();
			ps=con.prepareStatement("select * from persona where nombre like ?");
			ps.setString(1, "%"+nombreBusqueda+"%");
			
			rs=ps.executeQuery();
			
			while(rs.next()) {
				String nombre=rs.getString("nombre");
				String cedula= rs.getString("cedula");
				Personas p= new Personas();
				p.setNombre(nombre);
				p.setCedula(cedula);
				personas.add(p);
				
				
			}
			
			
		} catch (Exception e) {
			LOGGER.error("Error al consultar por nombre", e);
			throw new Exception("Error al consultar por nombre");
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de Datos", e);
				throw new Exception("Error con la base de Datos");
			}
		}
		
		return personas;
		
		
	}
	
	public static Personas buscarCedula (String cedula) throws Exception{
		Personas personas= new Personas();
		
		Connection con = null;
		PreparedStatement ps= null;
		ResultSet rs;
		
		try {
			con=ConexionBDD.conectar();
			ps=con.prepareStatement("select * from persona where cedula= ?");
			ps.setString(1, cedula);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				String nombre=rs.getString("nombre");
				String cedula1= rs.getString("cedula");
				Personas p= new Personas();
				
				p.setNombre(nombre);
				p.setCedula(cedula1);
				
				
				p.setNombre(nombre);
				
				p.setCedula(cedula1);
				
				
				
			}else {
				return null;
			}
			
			
			
			
		} catch (Exception e) {
			LOGGER.error("Error al consultar por cedula", e);
			throw new Exception("Error al consultar por cedula");
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de Datos", e);
				throw new Exception("Error con la base de Datos");
			}
		}
		
		
		return personas;
		
		
	}
	
	public static Personas buscarArgumentos(String nombre, String apellido) throws Exception{
		
		Personas personas= new Personas();
		
		Connection con = null;
		PreparedStatement ps= null;
		ResultSet rs= null;
		
		try {
			con= ConexionBDD.conectar();
			ps=con.prepareStatement("select * from persona where nombre = ? and apellido= ?");
			ps.setString(1, nombre);
			ps.setString(2, apellido);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				String nombre1=rs.getString("nombre");
				String cedula1= rs.getString("cedula");
				Personas p= new Personas();
				
				p.setNombre(nombre);
				p.setCedula(cedula1);
			
				
				p.setNombre(nombre1);
				
				p.setCedula(cedula1);
				
				
				
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de Datos", e);
				throw new Exception("Error con la base de Datos");
			}
		}
		
		return personas;
		
	}
}