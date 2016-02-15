/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ajanicorp.business.domain;



import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author Ajani
 */

public class Mensaje implements Serializable {
    @NotNull
    private int idMensaje;
    @NotBlank
    private String nombre;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String telefono;
    @NotBlank
    @Size(min = 4, max = 255)
    private String mensaje;

    public Mensaje(int id, String nombre, String email, String telefono, String mensaje) {
        this.idMensaje = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;

        this.mensaje = mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Mensaje() {
    }

    public int getId() {
        return idMensaje;
    }

    public void setId(int id) {
        this.idMensaje = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
