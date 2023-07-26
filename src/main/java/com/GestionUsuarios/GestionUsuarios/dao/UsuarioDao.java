package com.GestionUsuarios.GestionUsuarios.dao;

import com.GestionUsuarios.GestionUsuarios.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void eliminar(Long id);

    void registar(Usuario usuario);

    Usuario obtenerUsuarioPorCredenciales(Usuario usuario);
}
