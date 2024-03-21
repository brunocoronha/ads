/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sgcv.ads.interfaces;

import java.util.ArrayList;

import com.sgcv.ads.entities.Veiculo;

/**
 *
 * @author user
 */
public interface IModeloVeiculo {    
    public void incluir (Veiculo modelo) throws Exception;
    public void alterar(Veiculo modelo) throws Exception;
    public ArrayList<Veiculo> listagemDeModelos() throws Exception;
    public Veiculo consultar(Integer id) throws Exception;
}
