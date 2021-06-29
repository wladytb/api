/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wladytb.apirest.modelo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author wladi
 */
@XmlRootElement
public class usuarios {
    String usuario,password,photo,fullName,rol;

    public usuarios() {
    }

    public usuarios(String usuario, String password, String photo, String fullName, String rol) {
        this.usuario = usuario;
        this.password = password;
        this.photo = photo;
        this.fullName = fullName;
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
}
