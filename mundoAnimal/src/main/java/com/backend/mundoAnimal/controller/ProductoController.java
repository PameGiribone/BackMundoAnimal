package com.backend.mundoAnimal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.backend.mundoAnimal.entity.Categoria;
import com.backend.mundoAnimal.entity.Producto;
import com.backend.mundoAnimal.services.CategoriaService;
import com.backend.mundoAnimal.services.ProductoService;

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

    @PostMapping("/guardar")
    public Producto guardarProducto(@RequestBody Producto producto) {
        return productoService.guardarProducto(producto);
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
}
