package com.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	private String descripcion;
	private String tipo;
	private String proveedor;

	public Producto() {
		super();
	}

	public Producto(Integer codigo, String descripcion, String tipo, String proveedor) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.proveedor = proveedor;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", tipo=" + tipo + ", proveedor="
				+ proveedor + "]";
	}

}
