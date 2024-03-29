package com.example.model;

// ESTA CLASE NO SE USA EN ESTE EJERCICIO
public class Usuario {

	private Integer Id;
	private String dni;
	private String nombre;
	private String apellido;
	private String cargo;
	private String email;
	private String password;

	public Usuario() {
		super();
	}

	public Usuario(Integer id, String dni, String nombre, String apellido, String cargo, String email,
			String password) {
		super();
		Id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cargo = cargo;
		this.email = email;
		this.password = password;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [Id=" + Id + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", cargo="
				+ cargo + ", email=" + email + ", password=" + password + "]";
	}

}
