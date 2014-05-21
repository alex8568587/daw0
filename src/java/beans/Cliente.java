/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import java.util.ArrayList;



/**
 *
 * @author confalonieri
 */
public class Cliente  {
    
    private int id;
    private String nombre;
    private String email;
    private String telefono;
    private String direccion;
    private String numeroCc;
    private String numeroIban;
    private ArrayList<OrdenCliente> ordenClienteList;

    public Cliente() {
    }

    public Cliente(int id) {
        this.id = id;
    }

    public Cliente(int id, String nombre, String email, String telefono, String direccion, String numeroCc) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.numeroCc = numeroCc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroCc() {
        return numeroCc;
    }

    public void setNumeroCc(String numeroCc) {
        this.numeroCc = numeroCc;
    }

    public String getNumeroIban() {
        return numeroIban;
    }

    public void setNumeroIban(String numeroIban) {
        this.numeroIban = numeroIban;
    }

    
    public ArrayList<OrdenCliente> getOrdenClienteList() {
        return ordenClienteList;
    }

    public void setOrdenClienteList(ArrayList<OrdenCliente> ordenClienteList) {
        this.ordenClienteList = ordenClienteList;
    }

   
    
}
