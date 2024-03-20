
package com.sgcv.ads.interfaces;

import java.util.ArrayList;

import com.sgcv.ads.entities.Proprietario;

public interface IPropietarioCRUD {
    public void Incluir(Proprietario objPropietario) throws Exception;

    public void alterar(Proprietario proprietario) throws Exception;

    public ArrayList<Proprietario> listagemDePropietario() throws Exception;

    public Proprietario consultar(String cpf) throws Exception;
    //public Proprietario buscar(String cpf) throws Exception;
}
