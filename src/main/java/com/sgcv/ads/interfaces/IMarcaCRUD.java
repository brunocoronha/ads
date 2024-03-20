package com.sgcv.ads.interfaces;


import java.util.ArrayList;

import com.sgcv.ads.entities.Marca;

public interface IMarcaCRUD {
    public void incluir(Marca marca) throws Exception;
    public void alterar(Marca marca) throws Exception;
    public ArrayList<Marca> listagemDeMarcas()  throws Exception;
    public Marca consulaMarca(Integer id) throws Exception;
}
