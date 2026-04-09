/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade05.view;

/**
 *
 * @author eduardo
 */
public class Fatorial {
    private int valor; 
    private int fatorial;//Como usei INT os calculos nao podem ir tao longe
    private String formula = "";


    public void setValor(int valor) {
        this.valor = valor;
        int fat = 1;
        formula = " ";
        
        for (int i = valor; i > 1; i--){//Loop for simples
            fat *= i;
            formula += i + " x ";// As strings (formula) vão se juntando atã
        }
        formula += " 1 = " ;
        fatorial = fat;
    }

    public int getFatorial() {
        return fatorial;
    }

    public String getFormula() {
        return formula;
    }

}
