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
public class Usuario {
    long id;
    PerfilUsuario perfil;
    String nomeUsuario;
    String email;
    String senha;
    LocalDateTime ultimoLogin;
    boolean ativo;
    
    private List<Sessao> sessoes = new ArrayList<>();
    private List<LogAuditoria> logs = new ArrayList<>();


    public Usuario(long id, PerfilUsuario perfil, String nomeUsuario, String email, String senha) {
        this.id = id;
        this.perfil = perfil;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }


    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void setSessoes(List<Sessao> sessoes) {
        this.sessoes = sessoes;
    }

    public List<LogAuditoria> getLogs() {
        return logs;
    }

    public void setLogs(List<LogAuditoria> logs) {
        this.logs = logs;
    }
    
    @Override
    public String toString() {//Pediu pra eu por um @override, pra ficar por cima do toString original 
        return "Dados do usuario ->" + "id=" + id + ", nomeUsuario='" + nomeUsuario + '\'' + ", email='" + email + '\'' + ", ativo=" + ativo + "<-";//retorna ID nomeemail e se est
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }
    
    
}