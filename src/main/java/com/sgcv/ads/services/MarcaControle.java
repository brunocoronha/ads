package com.sgcv.ads.services;

import java.util.ArrayList;
import com.sgcv.ads.interfaces.IMarcaCRUD;
import com.sgcv.ads.entities.Marca;




public class MarcaControle implements IMarcaCRUD {

    IMarcaCRUD marcaPersistencia = null;

    public MarcaControle() {
        marcaPersistencia = null;
//        validacoes = new Validacoes();
    }

    @Override
    public void incluir(Marca marca) throws Exception {
        

    }

    @Override
    public void alterar(Marca marca) throws Exception {
        

    }

    @Override
    public ArrayList<Marca> listagemDeMarcas() throws Exception {
        return null;
    }

    @Override
    public Marca consulaMarca(Integer id) throws Exception {
        return null;
    }

}
