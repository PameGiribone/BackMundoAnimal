package com.backend.mundoAnimal.services;

import com.backend.mundoAnimal.entity.Producto;
import com.backend.mundoAnimal.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> listarProductos() {
        return productoRepository.findAll(); 
    }

    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto); 
    }

    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }

    public Producto obtenerProductoPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    public List<Producto> obtenerProductosPorCategoria(Long categoriaId) {
        return productoRepository.findByCategoriaId(categoriaId);
    }

    public Producto editarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public List<Producto> buscarProductos(String nombre) {
        return productoRepository.findByNombreContainingIgnoreCase(nombre);
    }
}