package com.iesam.edspotify.usuario.domain;

public class SaveUsuarioUseCase {

    UsuarioRepository usuarioRepository;

    public SaveUsuarioUseCase(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void execute (Usuario usuario){
        usuarioRepository.saveUsuario(usuario);
    }
}
