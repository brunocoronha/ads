/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sgcv.ads.interfaces;

import java.util.ArrayList;

import com.sgcv.ads.entities.Veiculo;

/**
 *
 * @author Gustavo Camargo
 */
public interface IVeiculoCRUD {
    public void incluir(Veiculo veiculo) throws Exception;
    public void alterar(Veiculo veiculo) throws Exception;
    public ArrayList<Veiculo> listagemDeVeiculos()  throws Exception;
    public Veiculo consultar(Integer id) throws Exception;
    //public TipoGastos buscar(Integer id) throws Exception;
}
