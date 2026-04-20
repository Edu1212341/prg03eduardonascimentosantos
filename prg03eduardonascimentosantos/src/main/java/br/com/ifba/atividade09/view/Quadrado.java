/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author eduardo
 */
public class Quadrado extends Forma2D{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        return Math.pow(lado, 2);
    }
    
    @Override
    public String toString(){
        return "Area do quadrado:  "+ this.obterArea() + "  Lado do quadrado: " + lado;
    }
    
}
