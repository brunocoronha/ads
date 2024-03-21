package com.sgcv.ads.services;

import java.util.ArrayList;
import com.sgcv.ads.interfaces.IPropietarioCRUD;
import com.sgcv.ads.entities.Proprietario;

public class ProprietarioControle implements IPropietarioCRUD {

    IPropietarioCRUD proprietarioPercistencia = null;
    ValidaCPF validarCPF = null;
    ValidarEmail validaEmail = null;
    ValidarCNH validaCNH = null;
    ValidarTelefone validaTelefone = null;
    ValidarNome validaNome = null;

    public ProprietarioControle() {
        proprietarioPercistencia = null;
        validarCPF = new ValidaCPF();
        validaEmail = new ValidarEmail();
        validaCNH = new ValidarCNH();
        validaTelefone = new ValidarTelefone();
        validaNome = new ValidarNome();
    }

    @Override
    public void Incluir(Proprietario objPropietario) throws Exception {
        
    }

    @Override
    public void alterar(Proprietario proprietario) throws Exception {
       
    }

    @Override
    public ArrayList<Proprietario> listagemDePropietario() throws Exception {
        return null;
    }

    @Override
    public Proprietario consultar(String cpf) throws Exception {
        return null;
    }
}
