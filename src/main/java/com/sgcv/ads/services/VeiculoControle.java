/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sgcv.ads.services;

import java.util.ArrayList;
import com.sgcv.ads.interfaces.IVeiculoCRUD;
import com.sgcv.ads.entities.Veiculo;


import com.sgcv.ads.controle.RedimensionarImagem;

/**
 *
 * @author Gustavo Camargo
 */
public class VeiculoControle implements IVeiculoCRUD {

    IVeiculoCRUD veiculoDAO = null;
    RedimensionarImagem operacoes = null;

    public VeiculoControle() {
      
    }

    @Override
    public void incluir(Veiculo veiculo) throws Exception {
        

    }

    @Override
    public void alterar(Veiculo veiculo) throws Exception {
        
    }

    @Override
    public ArrayList<Veiculo> listagemDeVeiculos() throws Exception {
        return null;
    }

    @Override
    public Veiculo consultar(Integer id) throws Exception {
        return null;
    }

}
