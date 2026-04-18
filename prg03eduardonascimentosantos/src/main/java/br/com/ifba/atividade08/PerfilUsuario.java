/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class PerfilUsuario {
    long id;
    String descricao;
    List <String> permissoes = new ArrayList <>();

    public PerfilUsuario(long id, String descricao, List<String> permissoes) {
        this.id = id;
        this.descricao = descricao;
        this.permissoes = permissoes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<String> permissoes) {
        this.permissoes = permissoes;
    }
    
    @Override
    public String toString() {
        return "PerfilUsuario->" + "id=" + id + ", descricao='" + descricao + '\'' + ", permissoes=" + permissoes + "<-";
    }

    void setPermissoes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
