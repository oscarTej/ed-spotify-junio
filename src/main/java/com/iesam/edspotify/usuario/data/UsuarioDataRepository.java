package com.iesam.edspotify.usuario.data;

import com.iesam.edspotify.usuario.data.local.UsuarioFileLocalDataSource;
import com.iesam.edspotify.usuario.domain.Usuario;
import com.iesam.edspotify.usuario.domain.UsuarioRepository;

import java.util.List;

public class UsuarioDataRepository implements UsuarioRepository {

    UsuarioFileLocalDataSource usuarioFileLocalDataSource;

    public UsuarioDataRepository(UsuarioFileLocalDataSource usuarioFileLocalDataSource) {
        this.usuarioFileLocalDataSource = usuarioFileLocalDataSource;
    }


    @Override
    public List<Usuario> getAllUsuarios() {
      return  usuarioFileLocalDataSource.findAll();


    }

    @Override
    public void saveUsuario(Usuario usuario) {
        usuarioFileLocalDataSource.save(usuario);
    }

    @Override
    public void deleteUsuario(String dni) {
        usuarioFileLocalDataSource.delete(dni);
    }

}


