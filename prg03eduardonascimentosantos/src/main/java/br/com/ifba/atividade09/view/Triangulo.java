/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author eduardo
 */
public class Triangulo extends Forma2D {//Eu pensei em fazer um triangulo abstrato e criar subclasses com os tipos de triangulosâ
   private double base;
   private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obterArea() {
        return (base * altura) / 2;
    }
    
   @Override
    public String toString(){
        return "Area do triangulo: " + this.obterArea() + "Base e altura do triangulo" + base + "  , " + altura;
    }
   
   
   
}
