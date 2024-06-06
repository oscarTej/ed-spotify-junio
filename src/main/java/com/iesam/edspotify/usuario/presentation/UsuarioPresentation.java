package com.iesam.edspotify.usuario.presentation;

import com.iesam.edspotify.usuario.data.UsuarioDataRepository;
import com.iesam.edspotify.usuario.data.local.UsuarioFileLocalDataSource;
import com.iesam.edspotify.usuario.domain.DeleteUsuarioUseCase;
import com.iesam.edspotify.usuario.domain.GetUsuariosUseCase;
import com.iesam.edspotify.usuario.domain.SaveUsuarioUseCase;
import com.iesam.edspotify.usuario.domain.Usuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class UsuarioPresentation {

    static Scanner input = new Scanner(System.in);

    public static void saveUsuario(){

    Usuario usuario = new Usuario("1234","Oscar","Tejerina","17/01/1994");
        SaveUsuarioUseCase saveUsuarioUseCase = new SaveUsuarioUseCase(
                new UsuarioDataRepository(new UsuarioFileLocalDataSource()));
        saveUsuarioUseCase.execute(usuario);


    }

    public static void getUsuarios (){

        GetUsuariosUseCase getUsuariosUseCase = new GetUsuariosUseCase(
                new UsuarioDataRepository(new UsuarioFileLocalDataSource()));

        List<Usuario> usuarios = getUsuariosUseCase.execute();

        System.out.println(usuarios);



    }
    public static void deleteusuario(){
        System.out.println("digame su dni ");
        String dni = input.next();
        DeleteUsuarioUseCase deleteUsuarioUseCase = new DeleteUsuarioUseCase(
                new UsuarioDataRepository(new UsuarioFileLocalDataSource()));

        deleteUsuarioUseCase.execute(dni);

        System.out.println("se ha borrado correctamente");
    }

}
