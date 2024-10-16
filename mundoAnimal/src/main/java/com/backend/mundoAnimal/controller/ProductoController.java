package com.backend.mundoAnimal.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.backend.mundoAnimal.entity.Categoria;
import com.backend.mundoAnimal.entity.Producto;
import com.backend.mundoAnimal.services.ProductoService;
import com.backend.mundoAnimal.services.CategoriaService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/listar")
    public List<Producto> listarProductos() {
        return productoService.listarProductos();
    }

    @PostMapping(value = "/guardar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Producto> guardarProducto(@RequestBody Producto producto) {
        return ResponseEntity.ok(productoService.guardarProducto(producto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Producto> actualizarProducto(@PathVariable Long id, @RequestBody Producto producto) {
        producto.setId(id);
        return ResponseEntity.ok(productoService.guardarProducto(producto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProducto(@PathVariable Long id) {
        productoService.eliminarProducto(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{productoId}/asignarCategoria/{categoriaId}")
    public ResponseEntity<Producto> asignarCategoria(@PathVariable Long productoId, @PathVariable Long categoriaId) {
        Producto producto = productoService.obtenerProductoPorId(productoId);
        Categoria categoria = categoriaService.obtenerCategoriaPorId(categoriaId);
        producto.setCategoria(categoria);
        return ResponseEntity.ok(productoService.guardarProducto(producto));
    }

    @GetMapping("/categoria/{categoriaId}")
    public List<Producto> obtenerProductosPorCategoria(@PathVariable Long categoriaId) {
        return productoService.obtenerProductosPorCategoria(categoriaId);
    }

    @PutMapping("/editarProducto")
    public ResponseEntity<Producto> editarProducto(@RequestBody Producto producto) {
        return ResponseEntity.ok(productoService.editarProducto(producto));
    }

    @GetMapping("/buscar")
    public List<Producto> buscarProductos(@RequestParam String nombre) {
        return productoService.buscarProductos(nombre);
    }
}
