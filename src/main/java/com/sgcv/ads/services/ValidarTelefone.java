/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sgcv.ads.services;

/**
 *
 * @author gustavocamargo.adm
 */
public class ValidarTelefone {
    public boolean validarTelefone(String numeroTelefone) {
        // Expressão regular para validar o número de telefone
        String regex = "^(\\d{8}|9\\d{8})$";
        System.out.println(numeroTelefone);
        return numeroTelefone.matches(regex);
    }
}
