package com.iesam.edspotify.usuario.domain;

import java.util.List;

public class GetUsuariosUseCase {
    UsuarioRepository usuarioRepository;

    public GetUsuariosUseCase(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> execute(){
      return   usuarioRepository.getAllUsuarios();
    }
}
