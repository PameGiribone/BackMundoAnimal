package com.backend.mundoAnimal.services;

import com.backend.mundoAnimal.entity.Usuario;
import com.backend.mundoAnimal.repository.UsuarioRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Usuario cambiarContraseña(Long id, String nuevaContraseña) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        usuario.setPassword(passwordEncoder.encode(nuevaContraseña));
        return usuarioRepository.save(usuario);
    }

    public Usuario listarUsuarioPorId(Long id) {
        return usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

    
    public List<Usuario> listarUsuario() {

        return usuarioRepository.findAll();
        

    }
}
