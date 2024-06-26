/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sgcv.ads.interfaces;

import java.io.File;
import java.util.ArrayList;

import com.sgcv.ads.entities.RegistraGastos;

/**
 *
 * @author Gustavo Camargo
 */
public interface IRegistraGastosCRUD {
    public void incluir(RegistraGastos objRegistroGasto) throws Exception;
    public void alterar(RegistraGastos objRegistraGastos) throws Exception;
    public ArrayList<RegistraGastos> listagemRegistroDeGastos()  throws Exception;
    public RegistraGastos consultar(Integer id) throws Exception;
}
