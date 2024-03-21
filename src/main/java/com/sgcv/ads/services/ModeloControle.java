package com.sgcv.ads.services;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.sgcv.ads.entities.Veiculo;
import com.sgcv.ads.interfaces.IModeloVeiculo;


/**
 *
 * @author user
 */
public class ModeloControle implements IModeloVeiculo {

    private IModeloVeiculo modelos = null;

    public ModeloControle() {
        modelos = null;
    }

    @Override
    public void incluir(Veiculo veiculo) throws Exception {
        
    }

    @Override
    public void alterar(Veiculo veiculo) throws Exception {
        
    }

    @Override
    public ArrayList<Veiculo> listagemDeModelos() throws Exception {
        return null;
    }

    @Override
    public Veiculo consultar(Integer id) throws Exception {
        return null;
    }

}
