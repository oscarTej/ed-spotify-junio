package com.iesam.edspotify.usuario.domain;

import java.util.List;

public interface UsuarioRepository {
    List<Usuario> getAllUsuarios();
    

    void saveUsuario(Usuario usuario);

    void deleteUsuario(String dni);
}
