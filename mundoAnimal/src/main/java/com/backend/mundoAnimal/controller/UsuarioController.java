package com.backend.mundoAnimal.controller;

import com.backend.mundoAnimal.entity.Usuario;
import com.backend.mundoAnimal.services.UsuarioService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/listarUsuarios")
    public List<Usuario> listarUsuario() {
        System.out.println("Listando usuarios");
        return usuarioService.listarUsuario();
    }

    @PutMapping("/cambiarContraseña/{id}")
    public ResponseEntity<Usuario> cambiarContraseña(@PathVariable Long id, @RequestBody String nuevaContraseña) {
        Usuario usuario = usuarioService.cambiarContraseña(id, nuevaContraseña);
        return ResponseEntity.ok(usuario);
    }

    @GetMapping("/listarUsuarioPorId/{id}")
    public ResponseEntity<Usuario> listarUsuarioPorId(@PathVariable Long id) {
        Usuario usuario = usuarioService.listarUsuarioPorId(id);
        return ResponseEntity.ok(usuario);
    }
    
}
