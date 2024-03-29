package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Producto;
import com.example.service.ProductoService;

@Controller
@RequestMapping("") // ("/productos")
public class ProductoController {

	private final Logger LOGGER = LoggerFactory.getLogger(ProductoController.class);

	@Autowired
	private ProductoService productoService;

	// MOSTRAR PRODUCTOS
	@GetMapping("/productos/consultar")
	public String show(Model model) {
		model.addAttribute("productos", productoService.findAll());
		return "/productos/consultar";
	}

	// CREAR PRODUCTOS
	@GetMapping("/productos/crear")
	public String create() {
		return "/productos/crear";
	}

	// GUARDAR REGISTROS
	@PostMapping("/productos/guardar")
	public String guardar(Producto producto) {
		LOGGER.info("Este el el producto guardado: {}", producto);
		productoService.save(producto);
		return "redirect:/productos/consultar";
	}

	// EDITAR PRODUCTOS
	@GetMapping("/productos/editar/{codigo}")
	public String editar(@PathVariable Integer codigo, Model model) {
		Producto producto = new Producto();
		Optional<Producto> optionalProducto = productoService.get(codigo);
		producto = optionalProducto.get();

		LOGGER.info("El producto buscado es: {}", producto);
		model.addAttribute("producto", producto);

		return "productos/editar";
	}

	// ACTUALIZAR INFO
	@PostMapping("/productos/update")
	public String actualizar(Producto producto) {
		productoService.update(producto);

		return "redirect:/productos/consultar";
	}

	// ELIMINAR PRODUCTO
	@GetMapping("/productos/delete/{codigo}")
	public String delete(@PathVariable Integer codigo) {
		productoService.delete(codigo);

		return "redirect:/productos/consultar";
	}

	// HOME
	@GetMapping("")
	public String titularPagina(Model model) {

		//ESTO SON PRUEBAS INICIALES
//		String titulo = "Lista de productos";
//		model.addAttribute("titulo", titulo);
//
//		Producto producto = new Producto();
//		producto.setCodigo(1);
//		producto.setDescripcion("Salsa de tomáte");
//		producto.setTipo("salsas");
//		producto.setProveedor("Fruco");
//
//		model.addAttribute("producto", producto);

		return "/productos/productos";
	}

}
