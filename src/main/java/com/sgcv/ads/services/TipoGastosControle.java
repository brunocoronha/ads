/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sgcv.ads.services;

import java.util.ArrayList;
import com.sgcv.ads.entities.TipoGastos;
import com.sgcv.ads.interfaces.ITipoGastosCRUD;

/**
 *
 * @author Gustavo Camargo
 */
public class TipoGastosControle implements ITipoGastosCRUD {

    ITipoGastosCRUD tipoGastosPersistencia = null;

    public TipoGastosControle() {
        tipoGastosPersistencia = null;
    }

    @Override
    public void incluir(TipoGastos objTipoGastos) throws Exception {
       
    }

    @Override
    public ArrayList<TipoGastos> listagemDeGastos() throws Exception {
        return tipoGastosPersistencia.listagemDeGastos();
    }

    @Override
    public void alterar(TipoGastos objTipoGastos) throws Exception {
        
    }

    @Override
    public TipoGastos consultar(Integer id) throws Exception {
        return null;
    }

//    @Override
//    public TipoGastos buscar(Integer id) throws Exception {
//        try {
//            if ( id == null ) throw new Exception("CAMPO OBRIGATORIO! Preencha o campo ID!!");
//            // Verifica se ja existe o ID no BD
//            return tipoGastosPersistencia.consultar(id);          
//        } catch (Exception erro) {
//            String msg = "Metodo buscar TipoGastosControle - " +erro.getMessage();
//            throw new Exception(msg);
//        }
//        
//    }
}
