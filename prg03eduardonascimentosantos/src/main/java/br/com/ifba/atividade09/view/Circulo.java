/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author eduardo
 */
public class Circulo extends Forma2D{//so precisa do raio para os calculos do circulo, da esfera tamb
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double obterArea() {
        return Math.PI * Math.pow(raio, 2);
    }
    
    @Override
    public String toString (){
        return "Area do circulo: " + this.obterArea() + "  Raio do circulo: " + raio;
    }
}
