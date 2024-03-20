/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sgcv.ads.interfaces;

import java.util.ArrayList;

import com.sgcv.ads.entities.TipoGastos;

/**
 *
 * @author Gustavo Camargo
 */
public interface ITipoGastosCRUD {
    public void incluir(TipoGastos objTipoGastos) throws Exception;
    public void alterar(TipoGastos objTipoGastos) throws Exception;
    public ArrayList<TipoGastos> listagemDeGastos()  throws Exception;
    public TipoGastos consultar(Integer id) throws Exception;
    //public TipoGastos buscar(Integer id) throws Exception;
}
