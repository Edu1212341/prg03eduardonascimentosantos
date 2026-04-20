/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author eduardo
 */
public class Piramide extends Forma3D{
    private double areaBase;
    private double areaLateral;
    private double altura;

    public Piramide(double areaBase, double areaLateral, double altura) {
        this.areaBase = areaBase;
        this.areaLateral = areaLateral;
        this.altura = altura;
    }

    @Override
    public double obterArea() {
        return areaBase + areaLateral;
    }

    @Override
    public double obterVolume() {
        return (areaBase * altura) / 3.0;
    }
    
    public String toString() {
        return "area da base: " + areaBase + " area lateral: " + areaLateral + "  altura: " + altura;
    }
    
    
}
