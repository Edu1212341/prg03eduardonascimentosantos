/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author eduardo
 */
public class Esfera extends Forma3D{
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override
    public double obterArea() {
        return 4 * Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double obterVolume() {
        return (4/3) * Math.PI * Math.pow(raio, 3);
    }
    
    @Override
    public String toString(){
        return "Raio: " + raio + " Area: " + this.obterArea() + " Volume: " + this.obterVolume();
    }
    
}
