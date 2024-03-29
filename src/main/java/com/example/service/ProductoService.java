package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Producto;

public interface ProductoService {

	public Producto save(Producto producto);

	public Optional<Producto> get(Integer codigo);

	public void update(Producto producto);

	public void delete(Integer codigo);

	public List<Producto> findAll();

}
