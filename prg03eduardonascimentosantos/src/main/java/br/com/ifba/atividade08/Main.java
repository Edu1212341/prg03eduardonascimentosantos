/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class Main {
    public static void main(String[] args){
        PerfilUsuario perfil = new PerfilUsuario(1, "ADMIN", null);
        
        List<String> permissoes = new ArrayList<>();//array de permissoes local
        permissoes.add("Criar");
        permissoes.add("Apagar");
        permissoes.add("Modificar os dados");
        permissoes.add("Deletar todo o sistema");
        perfil.setPermissoes(permissoes);  //seta essas permissoes criadas
        
        Usuario user = new Usuario(1, perfil, "eduardo", "email@zezao.com", "123");//usuario sendo criado
        user.setAtivo(true);
        user.setUltimoLogin(LocalDateTime.now());

        Sessao sessao = new Sessao(1, user, "TOKEN123");//criando sessao

        user.getSessoes().add(sessao); //maneira diferente que mantem a sessao original  e adciona essa nova, toda vez que for adcionar mais uma secao na lista a lista nao reseta.

        LogAuditoria log = new LogAuditoria(1, user, "LOGIN", LocalDateTime.now(), "127.0.0.1");

        user.getLogs().add(log);//Esse metodo é muito bom pra usar um loop

        // testando tudo
        System.out.println(user.getNomeUsuario());
        System.out.println(user.getPerfil().getDescricao());
        System.out.println(user.getSessoes().size());
        System.out.println(user.getLogs().size());
        
        System.out.println(" ");
        System.out.println(" ");

          //Com tostring
        System.out.println(user.toString());
        System.out.println(sessao.toString());
        
    }
}
