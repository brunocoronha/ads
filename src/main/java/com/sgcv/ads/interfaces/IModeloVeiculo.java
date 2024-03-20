/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sgcv.ads.interfaces;

import java.util.ArrayList;

import com.sgcv.ads.entities.ModeloVeiculo;

/**
 *
 * @author user
 */
public interface IModeloVeiculo {    
    public void incluir (ModeloVeiculo modelo) throws Exception;
    public void alterar(ModeloVeiculo modelo) throws Exception;
    public ArrayList<ModeloVeiculo> listagemDeModelos() throws Exception;
    public ModeloVeiculo consultar(Integer id) throws Exception;
}
