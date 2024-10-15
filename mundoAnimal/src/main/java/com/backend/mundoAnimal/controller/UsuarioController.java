package com.backend.mundoAnimal.controller;

import com.backend.mundoAnimal.entity.Usuario;
import com.backend.mundoAnimal.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/listarUsuarios")
    public List<Usuario> listarUsuarios() {
        System.out.println("Listando usuarios");
        return usuarioService.listarUsuarios();
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

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario usuario) {
        Usuario usuarioEncontrado = usuarioService.findByEmail(usuario.getEmail());
        if (usuarioEncontrado != null && passwordEncoder.matches(usuario.getPassword(), usuarioEncontrado.getPassword())) {
            return ResponseEntity.ok(usuarioEncontrado);
        }
        return ResponseEntity.status(401).build();
    }

 
}
