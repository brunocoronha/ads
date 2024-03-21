/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sgcv.ads.services;

import java.util.ArrayList;

import com.sgcv.ads.services.ValidaData;

import com.sgcv.ads.entities.RegistraGastos;
import com.sgcv.ads.interfaces.IRegistraGastosCRUD;

/**
 *
 * @author Gustavo Camargo
 */
public class RegistraGastoControle implements IRegistraGastosCRUD {

    IRegistraGastosCRUD registraGastoPersistencia = null;
    ValidaData validaData = null;

    public RegistraGastoControle() {
        registraGastoPersistencia = null;
        validaData = new ValidaData();
    }

    @Override
    public void incluir(RegistraGastos objRegistroGasto) throws Exception {
        

    }

    @Override
    public ArrayList<RegistraGastos> listagemRegistroDeGastos() throws Exception {
        return null;
    }

    @Override
    public void alterar(RegistraGastos objRegistraGastos) throws Exception {
        
    }

    @Override
    public RegistraGastos consultar(Integer id) throws Exception {
        return null;
    }
}
