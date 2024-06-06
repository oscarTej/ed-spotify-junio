package com.iesam.edspotify.usuario.domain;

public class DeleteUsuarioUseCase {

    UsuarioRepository usuarioRepository;

    public DeleteUsuarioUseCase(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void execute(String dni){
        usuarioRepository.deleteUsuario(dni);
    }
}
