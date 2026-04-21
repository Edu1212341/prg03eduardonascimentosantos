/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class Main {
    public static void main (String[] args){
        List<Forma> formas = new ArrayList<>();
        
        formas.add(new Circulo(7.5)); //Pedi para uma IA me dizer valores cabiveis para as formas
        formas.add(new Cubo(3.3));
        formas.add(new Esfera(4.2));
        formas.add(new Piramide(16.0, 24.0, 6.0));
        formas.add(new Quadrado(6.0));
        formas.add(new Triangulo(8.0, 5.0));
        
        
        for(Forma formaLida: formas){//for aprimorado para percorrer e citar o toString de cada um
            System.out.println(formaLida.toString());
        }
    }
    
    
}
