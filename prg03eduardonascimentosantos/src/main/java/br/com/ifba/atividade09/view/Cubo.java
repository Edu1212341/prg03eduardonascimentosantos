/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author eduardo
 */
public class Cubo extends Forma3D{//cada forma tem suas variaveis especificas
    private double linha;

    public Cubo(double linha) {
        this.linha = linha;
    }

    @Override
    public double obterArea() {
        return 6 * Math.pow(linha, 2);
    }

    @Override
    public double obterVolume() {
        return Math.pow(linha, 3);
    }
    
    public String toString(){
        return "Aresta:  " + linha + "  Area: " + this.obterArea() + "  Volume:  " + this.obterVolume();
    }
    
}
