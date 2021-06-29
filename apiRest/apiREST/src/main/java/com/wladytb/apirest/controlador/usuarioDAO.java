/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wladytb.apirest.controlador;

import com.wladytb.apirest.modelo.usuarios;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wladi
 */
public class usuarioDAO {

    public List<usuarios> verificar(String userName, String password) {
        List<usuarios> listaUsuario = new ArrayList<>();
        for (usuarios user : crearObjetos()) {
            if (user.getUsuario().equals(userName) && user.getPassword().equals(password)) {
                listaUsuario.add(user);
                return listaUsuario;
            }
        }
        return listaUsuario;
    }

    public List<usuarios> crearObjetos() {
        List<usuarios> listaUsuario = new ArrayList<>();
        listaUsuario.add(new usuarios("wladytb", "wlady123456", "photo", "Tyrone Tocta","admin"));
        listaUsuario.add(new usuarios("juanC", "123456", "photo", "Juan Montalvo","user"));
        listaUsuario.add(new usuarios("manuel123", "123456", "photo", "Manuel Espinoza","admin"));
        listaUsuario.add(new usuarios("monica123", "123456", "photo", "Monica Monar","user"));
        listaUsuario.add(new usuarios("jacinto123", "123456", "photo", "Jaciento Lopez","user"));
        return listaUsuario;
    }
}
