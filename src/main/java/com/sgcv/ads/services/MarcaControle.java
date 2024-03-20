package com.sgcv.ads.services;

import java.util.ArrayList;
import com.sgcv.ads.interfaces.IMarcaCRUD;
import com.sgcv.ads.entities.Marca;
import com.sgcv.ads.persistencia.MarcaDAO;


public class MarcaControle implements IMarcaCRUD {

    IMarcaCRUD marcaPersistencia = null;

    public MarcaControle() {
        marcaPersistencia = new MarcaDAO();
//        validacoes = new Validacoes();
    }

    @Override
    public void incluir(Marca marca) throws Exception {
        try {
            if (consulaMarca(marca.getId()) != null) {
                throw new Exception("ID já registrado");
            }
            if (marca.getId() == -1) {
                throw new Exception("Digite um ID!");
            }
            if (marca.getDescricao().isEmpty()) {
                throw new Exception("Digite uma descrição!");
            }
            if (marca.getLogo() == null) {
                throw new Exception("Selecione uma imagem para a logo!");
            }
            marcaPersistencia.incluir(marca);
        } catch (Exception erro) {
            throw new Exception(erro.getMessage());
        }

    }

    @Override
    public void alterar(Marca marca) throws Exception {
        try {
            if (marca.getDescricao().isEmpty()) {
                throw new Exception("Digite uma descrição!");
            }
            if (marca.getLogo() == null) {
                throw new Exception("Selecione uma imagem para a logo!");
            }
            marcaPersistencia.alterar(marca);
        } catch (Exception erro) {
            throw new Exception(erro.getMessage());
        }

    }

    @Override
    public ArrayList<Marca> listagemDeMarcas() throws Exception {
        return marcaPersistencia.listagemDeMarcas();
    }

    @Override
    public Marca consulaMarca(Integer id) throws Exception {
        return marcaPersistencia.consulaMarca(id);
    }

}
