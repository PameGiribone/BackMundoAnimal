package com.backend.mundoAnimal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.mundoAnimal.entity.Categoria;
import com.backend.mundoAnimal.services.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/listar")
    public List<Categoria> listarCategorias() {
        return categoriaService.listarCategorias();
    }

    @PostMapping
    public Categoria guardarCategoria(@RequestBody Categoria categoria) {
        return categoriaService.guardarCategoria(categoria);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Categoria> actualizarCategoria(@PathVariable Long id, @RequestBody Categoria categoria) {
        categoria.setId(id);
        return ResponseEntity.ok(categoriaService.guardarCategoria(categoria));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCategoria(@PathVariable Long id) {
        categoriaService.eliminarCategoria(id);
        return ResponseEntity.noContent().build();
    }
}
