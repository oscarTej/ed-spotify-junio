package com.iesam.edspotify.usuario.domain;

import com.iesam.edspotify.usuario.data.UsuarioDataRepository;
import com.iesam.edspotify.usuario.data.local.UsuarioFileLocalDataSource;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class GetUsuariosUseCaseTest {

    @Mock
    UsuarioRepository usuarioRepository;
    SaveUsuarioUseCase saveUsuarioUseCase;

    @BeforeEach
    void setUp() {
        saveUsuarioUseCase = new SaveUsuarioUseCase(usuarioRepository);

    }

    @AfterEach
    void tearDown() {
        saveUsuarioUseCase = null;

    }

    @Test
    void cuandoGuardoUnUsuarioSeGuardaCorrectamente() {

        Usuario usuario = new Usuario("6554","Arturo","Sanchez","12/12/2002");

        Mockito.verify(usuarioRepository, Mockito.times(1)).saveUsuario(usuario);

    }
}