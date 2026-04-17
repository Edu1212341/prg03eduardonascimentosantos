/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

import javax.swing.JOptionPane;

/**
 *
 * @author eduardo
 */
public class PagamentoDinheiro implements Pagamento{
    private double valor;

    public PagamentoDinheiro(double valor) {
        this.valor = valor;
    }
    
    public double calcularTotal(){
        return valor - (valor * 0.10);
    }
    
    public void imprimirRecibo(){
        JOptionPane.showMessageDialog(null, "Valor total: "+ this.calcularTotal() + "      Desconto Aplicado:  -" + (valor * 0.10));//JOptionPane salva vidas

    }
}
