package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.krakedev.colecciones.Persona;

public class MaquinaDulces {
	private ArrayList<Celda> celdas = new ArrayList<>();
	private double saldo;

	public ArrayList<Celda> getCeldas() {
		return celdas;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void agregarCelda(Celda codigo1) {
		Celda agregarCelda = new Celda(codigo1.getCodigo());
		celdas.add(agregarCelda);

	}

	public void mostrarConfiguracion() {
		Celda elemento;
		for (int i = 0; i < celdas.size(); i++) {
			elemento = celdas.get(i);
			System.out.println("celda: " + elemento.getCodigo());

		}

	}

	public Celda buscarCelda(String codigo) {
		Celda celdaEncontrada = null;
		Celda elemento = null;
		for (int i = 0; i < celdas.size(); i++) {
			elemento = celdas.get(i);
			if (elemento.getCodigo().equals(codigo)) {
				celdaEncontrada = elemento;

			}
		}
		return celdaEncontrada;

	}

	public void cargarProducto(Producto producto, String codigo, int cantidadIncial) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, cantidadIncial);

	}

	public void mostrarProductos() {

		Celda elemento;
		for (int i = 0; i < celdas.size(); i++) {
			elemento = celdas.get(i);
			if (elemento.getProducto() != null) {
				System.out.println("celda:" + elemento.getCodigo() + " " + "stock: " + elemento.getStock() + " "
						+ "codigo: " + elemento.getProducto().getCodigo() + " " + "Precio: "
						+ elemento.getProducto().getPrecio());

			} else {
				System.out.println("celda: " + elemento.getCodigo() + " " + "strock: " + elemento.getStock() + " "
						+ "sin producto asignado");
			}

		}
	}

	public Producto buscarProductoEnCelda(String codigo) {
		Celda celdaRecuperada = buscarCelda(codigo);
		Producto productoEncontrado = null;
		if (celdaRecuperada != null) {
			return productoEncontrado = celdaRecuperada.getProducto();
		} else {
			return productoEncontrado;
		}
	}

	public double consultarPrecio(String codigoCelda) {
		Producto productoEncontrado = buscarProductoEnCelda(codigoCelda);
		double precio = 0.0;
		if (productoEncontrado != null) {
			precio = productoEncontrado.getPrecio();
		}
		return precio;
	}

	public Celda buscarCeldaProducto(String codigoProducto) {
		Celda elemento = null;
		Celda encontrado = null;

		for (int i = 0; i < celdas.size(); i++) {
			elemento = celdas.get(i);

			if (elemento.getCodigo().equals(codigoProducto));
				encontrado = elemento;
				return encontrado;

		}
		return encontrado;
	}
	
	
	public void incrementarProductos(String codigoProducto, int cantidadItemsIncrementar) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		if(celdaEncontrada != null) {
			int unStock = celdaEncontrada.getStock();
			unStock=unStock+cantidadItemsIncrementar;
			celdaEncontrada.setStock(unStock);
		}
		
	}
	
	public void vender(String codigoCelda) {
		Celda celdaAVender = buscarCelda(codigoCelda);
		if (celdaAVender != null) {
			celdaAVender.getProducto().disminuirPrecio(saldo);
			
			Producto productoVenta = celdaAVender.getProducto();
			double precioVenta = productoVenta.getPrecio();
			this.saldo += precioVenta;
			
			mostrarProductos();
		}
	}
	
	public double venderConCambio(String codigoCelda, double valorIngresado) {
		double cambio = 0.0;
		Celda cambioVender = buscarCelda(codigoCelda);
		if (cambioVender != null) {
			cambioVender.getProducto().disminuirPrecio(saldo);
			
			Producto productoVenta = cambioVender.getProducto();
			double precioVenta = productoVenta.getPrecio();
			cambio = valorIngresado-precioVenta;
			
			this.saldo += precioVenta;
			
			mostrarProductos();
		}
		return cambio;
	}
	
	public ArrayList<Producto> buscarMenores(double limite){
		ArrayList<Producto> menores= new ArrayList<Producto>();
		Producto elementoEncontrado= null;
		for(int i=0;i<celdas.size();i++) {
			elementoEncontrado= celdas.get(i);
			
			if(elementoEncontrado.getPrecio()> limite);
			menores.add(elementoEncontrado);
			
		}
		return menores;
	}

	
	
}
